package shapes;

public class Pyramid extends shapes {

	private double height;
	private double radius;

	/**
	 * Initializes the newly created Cylinder
	 */
	public Pyramid(double height, double radius) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.radius = radius;
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
