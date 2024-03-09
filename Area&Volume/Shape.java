public abstract class Shape {
    public void showShape(String shape) {
        System.out.println("Selected shape: " + shape);
    }

    public abstract double calculateShape();
    public abstract double calculatePerimeter();
}
