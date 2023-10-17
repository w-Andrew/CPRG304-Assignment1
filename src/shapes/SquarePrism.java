package shapes;

public class SquarePrism {
	int height;
	int edge;
	
	public SquarePrism(int theHeight, int edgeLenght) {
		this.height = theHeight;
		this.edge = edgeLenght;
	}
	public int ReturnVolume() {
		return this.ReturnBase()*height;
	}
	public int ReturnSurfaceArea() {
		return 2*(this.ReturnBase()) + 4*(edge*height);
	}
	public int ReturnBase() {
		return edge*edge;
	}

}
