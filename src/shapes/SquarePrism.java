package shapes;

public class SquarePrism extends shapes{
	double height;
	double edge;
	
	public SquarePrism(double theHeight, double edgeLenght) {
		this.height = theHeight;
		this.edge = edgeLenght;
	}
	public double ReturnVolume() {
		return this.ReturnBase()*height;
	}
	public double ReturnSurfaceArea() {
		return 2*(this.ReturnBase()) + 4*(edge*height);
	}
	public double ReturnBaseArea() {
		return ReturnBase();
	}
	public double ReturnBase() {
		return edge*edge;
	}

}
