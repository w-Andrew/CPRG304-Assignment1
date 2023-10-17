package shapes;

public class Pyramid extends shapes {
	
	double side;

	public Pyramid(double height, double side) {
		this.height = height;
		this.side = side;
	}

	@Override
	public double ReturnVolume() {
		return (side * side * height) / 3;
	}

	@Override
	public double ReturnBaseArea() {
		return side * side;
	}

}
