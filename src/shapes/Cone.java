package shapes;

public class Cone extends shapes {
	
	double radius;

	public Cone(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	@Override
	public double ReturnVolume() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius * (height / 3);
	}

	@Override
	public double ReturnBaseArea() {
		return Math.PI * radius * radius;
	}

}
