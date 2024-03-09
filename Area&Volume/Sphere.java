public class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateShape() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 0; // Not applicable for a sphere
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
