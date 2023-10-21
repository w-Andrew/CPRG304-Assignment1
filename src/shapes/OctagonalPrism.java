package shapes;

public class OctagonalPrism extends shapes {

	private double height;
	private double side;

	public OctagonalPrism(double height, double sideLength) {
		this.height = height;
		this.side = sideLength;
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

	@Override
	public double getHeight() {
		return this.height;
	}

	@Override
	public int compareTo(shapes o) {
		// TODO Auto-generated method stub
		return (int) (this.height - o.getHeight());
	}

	public double compare(String type, shapes o) {
		double result = 0;

		switch (type) {
		case ("v"):
			result = this.ReturnVolume() - o.ReturnVolume();
			break;
		case ("a"):
			result = this.ReturnSurfaceArea() - o.ReturnSurfaceArea();
			break;
		}
		return result;
	}
}
