public class Pyramid extends Shape implements Volume {
    private double baseLength;
    private double baseWidth;
    private double height;

    public Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public double calculateShape() {
        return baseLength * baseWidth;
    }

    @Override
    public double calculatePerimeter() {
        // Not applicable for a pyramid
        return 0;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * baseLength * baseWidth * height;
    }
}
