package shapes;

public class OctagonalPrism extends shapes {
    private double height;
    private double sideLength;

    public OctagonalPrism(double height, double sideLength) {
        this.height = height;
        this.sideLength = sideLength;
    }

    public double getBaseArea() {
        return 2 * sideLength * sideLength * (1 + Math.sqrt(2));
    }

    public double getVolume() {
        return getBaseArea() * height;
    }

    public double getSurfaceArea() {
        double baseArea = getBaseArea();
        double lateralArea = 8 * sideLength * height;
        return 2 * baseArea + lateralArea;
    }
}
