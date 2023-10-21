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
	public double getHeight() {
		return this.height;
	}

	@Override
	public int compareTo(shapes o) {
		// TODO Auto-generated method stub
		return (int) (this.height - o.getHeight());
	}

	public double compare(String type, shapes o) {
		double result = 0;

		switch (type) {
		case ("v"):
			result = this.ReturnVolume() - o.ReturnVolume();
			break;
		case ("a"):
			result = this.ReturnSurfaceArea() - o.ReturnSurfaceArea();
			break;
		}
		return result;
	}

}
