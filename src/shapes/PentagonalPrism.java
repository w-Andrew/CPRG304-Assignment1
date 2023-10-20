package shapes;

public class PentagonalPrism extends shapes {
	double height;
	double edge;

	public PentagonalPrism(double theHeight, double edgeLenght) {
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

	public double ReturnBase() {
		return (this.PentagonRadius() * edge) / 2;
	}

	public double PentagonRadius() {
		return (edge / 2) / Math.tan(36);
	}

	@Override
	public int compareTo(shapes o) {
		// TODO Auto-generated method stub
		return (int) (this.height - o.height);
	}
}
