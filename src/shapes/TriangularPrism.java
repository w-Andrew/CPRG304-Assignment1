package shapes;

public class TriangularPrism extends shapes {
	double height;
	double edge;

	public TriangularPrism(double theHeight, double edgeLenght) {
		this.height = theHeight;
		this.edge = edgeLenght;
	}

	@Override
	public double ReturnVolume() {
		return this.ReturnBase() * height;
	}

	@Override
	public double ReturnSurfaceArea() {
		return 2 * (this.ReturnBase()) + 3 * (edge * height);
	}

	public double ReturnBase() {
		return (edge * edge) / 2;
	}

	@Override
	public int compareTo(shapes o) {
		// TODO Auto-generated method stub
		return (int) (this.height - o.height);
	}
}
