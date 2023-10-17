package shapes;

public class TriangularPrism {
	int height;
	int edge;
	
	public TriangularPrism(int theHeight, int edgeLenght) {
		this.height = theHeight;
		this.edge = edgeLenght;
	}
	public int ReturnVolume() {
		return this.ReturnBase()*height;
	}
	public int ReturnSurfaceArea() {
		return 2*(this.ReturnBase()) + 3*(edge*height);
	}
	public int ReturnBase() {
		return (edge*edge)/2;
	}
}
