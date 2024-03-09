public class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateShape() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Not applicable for a cylinder
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}
