package shape;

public abstract class shapes {
	
	double height;
	
	public shapes(double height) {
		this.height = height;
	}
	
	public abstract double calcVolume();
	public abstract double calcBaseArea();
	
	
	public double getHeight() {
		return height;
	}
}
