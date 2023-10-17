package shapes;

public class TriangularPrism extends shapes{
	double height;
	double edge;
	
	public TriangularPrism(double theHeight, double edgeLenght) {
		this.height = theHeight;
		this.edge = edgeLenght;
	}
	public double ReturnVolume() {
		return this.ReturnBase()*height;
	}
	public double ReturnSurfaceArea() {
		return 2*(this.ReturnBase()) + 3*(edge*height);
	}
	public double ReturnBaseArea() {
		return (edge*edge)/2;
	}
	public double ReturnBase() {
		return (edge*edge)/2;
	}
}
