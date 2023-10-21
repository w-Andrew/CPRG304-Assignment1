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
    // TODO Auto-generated method stub
		return (Math.PI * Math.pow(radius, 2) * (this.height / 3));
	}

	@Override
	public double getHeight() {
		return this.height;

	@Override
	public double ReturnBaseArea() {
		return Math.PI * radius * radius;

	}

}
