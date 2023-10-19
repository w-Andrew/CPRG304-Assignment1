package shapes;

public class OctagonalPrism extends shapes {
    private double height;
    private double side;
	private double s;

    public OctagonalPrism(double height, double side) {
        this.height = height;
        this.s = side;
    }

    public double getBaseArea() {
        return 2 * side * side * (1 + Math.sqrt(2));
    }

    public double getVolume() {
        return getBaseArea() * height;
    }

    public double getSurfaceArea() {
        double baseArea = getBaseArea();
        double lateralArea = 8 * side * height;
        return 2 * baseArea + lateralArea;
    }
}
