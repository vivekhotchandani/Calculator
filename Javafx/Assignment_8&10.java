package com.example.demo1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.sql.*;

public class Assignment extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Employee Management System");

        // Main layout is a BorderPane here
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(20, 20, 20, 20));

        // GridPane for form
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        // Form fields and labels
        grid.add(new Label("Employee ID:"), 0, 0);
        TextField employeeIDField = new TextField();
        employeeIDField.setPromptText("Employee ID");
        grid.add(employeeIDField, 1, 0);

        grid.add(new Label("Name:"), 0, 1);
        TextField nameField = new TextField();
        nameField.setPromptText("Name");
        grid.add(nameField, 1, 1);

        grid.add(new Label("Age:"), 0, 2);
        TextField ageField = new TextField();
        ageField.setPromptText("Age");
        grid.add(ageField, 1, 2);

        grid.add(new Label("Email:"), 0, 3);
        TextField emailField = new TextField();
        emailField.setPromptText("Email");
        grid.add(emailField, 1, 3);

        grid.add(new Label("Department:"), 0, 4);
        TextField departmentField = new TextField();
        departmentField.setPromptText("Department");
        grid.add(departmentField, 1, 4);

        // Buttons with a horizontal layout
        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        Button createTableButton = new Button("Create Table");
        Button deleteTableButton = new Button("Delete Table");
        Button registerButton = new Button("Register");
        Button viewButton = new Button("View Employees");
        Button updateButton = new Button("Update Info");
        buttonBox.getChildren().addAll(createTableButton, deleteTableButton, registerButton, viewButton, updateButton);

        // Add grid and buttons to the border pane
        borderPane.setCenter(grid);
        borderPane.setBottom(buttonBox);
        BorderPane.setAlignment(buttonBox, Pos.CENTER);
        BorderPane.setMargin(buttonBox, new Insets(20, 0, 0, 0));

        // Set scene and styles
        Scene scene = new Scene(borderPane, 400, 300);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

        // Database interaction events
        createTableButton.setOnAction(e -> createEmployeeTable());
        deleteTableButton.setOnAction(e -> deleteEmployeeTable());
        registerButton.setOnAction(e -> registerEmployee(employeeIDField.getText(), nameField.getText(), ageField.getText(), emailField.getText(), departmentField.getText()));
        viewButton.setOnAction(e -> viewEmployees());
        updateButton.setOnAction(e -> updateEmployeeInfo(employeeIDField.getText(), nameField.getText(), ageField.getText(), emailField.getText(), departmentField.getText()));


    }

    private void createEmployeeTable() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "1414");
             Statement statement = con.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS employees (" +
                    "id INT PRIMARY KEY," +
                    "name VARCHAR(100) NOT NULL," +
                    "age INT NOT NULL," +
                    "email VARCHAR(100) NOT NULL," +
                    "department VARCHAR(100) NOT NULL" +
                    ")";

            statement.executeUpdate(sql);
            System.out.println("Employee table created!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteEmployeeTable() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "1414");
             Statement statement = con.createStatement()) {
            String sql = "DROP TABLE IF EXISTS employees";

            statement.executeUpdate(sql);
            System.out.println("Employee table deleted!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void registerEmployee(String id, String name, String age, String email, String department) {
        if (!isTableExists()) {
            displayError("Error: Employee table does not exist!");
            return;
        }

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "1414");
             PreparedStatement statement = con.prepareStatement(
                     "INSERT INTO employees (id, name, age, email, department) VALUES (?, ?, ?, ?, ?)")) {

            if (employeeExists(con, id)) {
                displayError("Error: Employee ID already exists!");
                return;
            }

            statement.setInt(1, Integer.parseInt(id));
            statement.setString(2, name);
            statement.setInt(3, Integer.parseInt(age));
            statement.setString(4, email);
            statement.setString(5, department);

            statement.executeUpdate();

            System.out.println("Employee registered successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean employeeExists(Connection con, String id) throws SQLException {
        PreparedStatement statement = con.prepareStatement("SELECT id FROM employees WHERE id = ?");
        statement.setInt(1, Integer.parseInt(id));
        ResultSet resultSet = statement.executeQuery();
        return resultSet.next(); // Returns true if ID exists, false otherwise
    }

    private boolean isTableExists() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "1414")) {
            DatabaseMetaData metaData = con.getMetaData();
            try (ResultSet resultSet = metaData.getTables(null, null, "employees", null)) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    private void displayError(String errorMessage) {
        Label errorLabel = new Label(errorMessage);

        Stage errorStage = new Stage();
        errorStage.setTitle("Error");
        errorStage.setScene(new Scene(new StackPane(errorLabel), 300, 100));
        errorStage.show();
    }

    private void viewEmployees() {
        StringBuilder employeeDetails = new StringBuilder();

        if (!isTableExists()) {
            displayError("Error: Employee table does not exist!");
            return;
        }

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "1414");
             Statement statement = con.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM employees")) {

            employeeDetails.append("Registered Employees:\n\n");

            while (resultSet.next()) {
                employeeDetails.append("ID: ").append(resultSet.getInt("id")).append("\n");
                employeeDetails.append("Name: ").append(resultSet.getString("name")).append("\n");
                employeeDetails.append("Age: ").append(resultSet.getInt("age")).append("\n");
                employeeDetails.append("Email: ").append(resultSet.getString("email")).append("\n");
                employeeDetails.append("Department: ").append(resultSet.getString("department")).append("\n");
                employeeDetails.append("---------------------\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        TextArea textArea = new TextArea(employeeDetails.toString());
        textArea.setEditable(false);

        Stage employeeDetailsStage = new Stage();
        employeeDetailsStage.setTitle("Registered Employees");
        employeeDetailsStage.setScene(new Scene(new StackPane(textArea), 400, 300));
        employeeDetailsStage.show();
    }

    private void updateEmployeeInfo(String id, String name, String age, String email, String department) {
        if (!isTableExists()) {
            displayError("Error: Employee table does not exist!");
            return;
        }

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "1414");
             PreparedStatement statement = con.prepareStatement(
                     "UPDATE employees SET name = ?, age = ?, email = ?, department = ? WHERE id = ?")) {

            statement.setString(1, name);
            statement.setInt(2, Integer.parseInt(age));
            statement.setString(3, email);
            statement.setString(4, department);
            statement.setInt(5, Integer.parseInt(id));

            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Employee information updated successfully.");
            } else {
                System.out.println("No employee found with ID: " + id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
