package shapes;

/**
 * Class description:
 *
 * @author Andrew Wahlers (775340)
 *
 */
public class Cylinder extends shapes {
	private double height;
	private double radius;

	/**
	 * Initializes the newly created Cylinder
	 */
	public Cylinder(double height, double radius) {
		// TODO Auto-generated constructor stub

		this.height = height;
		this.radius = radius;
	}

	@Override
	public double ReturnSurfaceArea() {
		return (2 * Math.PI * this.radius * height + 2 * Math.PI * Math.pow(radius, 2));
	}

	@Override
	public double ReturnVolume() {
		return (Math.PI * Math.pow(radius, 2) * this.height);
	}

	@Override
	public double getHeight() {
		return this.height;
	}

	@Override//Probably not needed
	public double ReturnBaseArea() {
		return Math.PI * radius * radius;
	}

}
