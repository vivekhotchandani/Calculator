/* Name - Vivek Hotchandani
PRN-22070126133
Batch - AIML-B3
*/
public abstract class Shape {
    public void showShape(String shape) {
        System.out.println("Selected shape: " + shape);
    }

    public abstract double calculateShape();
    public abstract double calculatePerimeter();
}
