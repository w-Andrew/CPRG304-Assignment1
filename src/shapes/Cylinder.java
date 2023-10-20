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
	public int compareTo(shapes o) {
		// TODO Auto-generated method stub
		return (int) (this.height - o.height);
	}
}
