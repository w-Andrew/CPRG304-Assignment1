package shape;
public class Cone extends shapes {
	
	double radius;

	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius * (height / 3);
	}

	@Override
	public double calcBaseArea() {
		return Math.PI * radius * radius;
	}

}
