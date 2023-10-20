package shapes;

public class Cylinder extends shapes {
	
	double radius;

	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	@Override
	public double ReturnVolume() {
		return Math.PI * radius * radius * height;
	}

	@Override
	public double ReturnBaseArea() {
		return Math.PI * radius * radius;
	}

}
