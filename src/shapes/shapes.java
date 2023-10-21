package shapes;

public abstract class shapes implements Comparable<shapes> {
	double height;

	public double ReturnSurfaceArea() {
		return 0;
	}

	public double ReturnVolume() {
		return 0;
	}

	public double getHeight() {
		return height;
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
