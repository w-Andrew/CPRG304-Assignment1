package shapes;

public class Pyramid extends shapes {

  //This is a little mess up with different version, added all varible and funciton that I saw
	private double height;
	private double radius;
  double side;
  
	/**
	 * Initializes the newly created Cylinder
	 */
	public Pyramid(double height, double radius) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.radius = radius;
    this.side = radius;
	}

	@Override
	public double getHeight() {
		return this.height;
	}
	
	@Override
	public double ReturnVolume() {
		return (side * side * height) / 3;
	}

	//@Override
	public double ReturnBaseArea() {
		return side * side;

	}

}
