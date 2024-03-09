/* Name - Vivek Hotchandani
PRN-22070126133
Batch - AIML-B3
*/
import java.util.Scanner;

public class Menu {
    public static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
    }

    public static String getChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (1/2/3/4/5): ");
        return scanner.nextLine();
    }
}
