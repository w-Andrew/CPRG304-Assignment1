package shapes;

public class SquarePrism extends shapes {
	double height;
	double edge;

	public SquarePrism(double theHeight, double edgeLenght) {
		this.height = theHeight;
		this.edge = edgeLenght;
	}

	@Override
	public double ReturnVolume() {
		return this.ReturnBase() * height;
	}

	@Override
	public double ReturnSurfaceArea() {
		return 2 * (this.ReturnBase()) + 4 * (edge * height);
	}
  
  //Probably duplicate function, leaving for now
	public double ReturnBaseArea() {
		return ReturnBase();
	}
  
	public double ReturnBase() {
		return edge * edge;
	}

	@Override
	public double getHeight() {
		return this.height;
	}

	@Override
	public int compareTo(shapes o) {
		// TODO Auto-generated method stub
		return (int) (this.height - o.getHeight());
	}

}
