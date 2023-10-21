package shapes;

/**
 * Class description:
 *
 *
 */
public class Cone extends shapes {
	private double height;
	private double radius;

	/**
	 * Initializes the newly created Cylinder
	 */
	public Cone(double height, double radius) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.radius = radius;
	}

	@Override
	public double ReturnSurfaceArea() {
		return (Math.PI * Math.pow(radius, 2));
	}

	@Override
	public double ReturnVolume() {
		return (Math.PI * Math.pow(radius, 2) * (this.height / 3));
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
