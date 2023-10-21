package shapes;

public abstract class shapes implements Comparable<shapes> {
	double height;

	String sortingBy;

	public double ReturnSurfaceArea() {
		return 0;
	}

	public double ReturnVolume() {
		return 0;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public int compareTo(shapes otherShape) {
		return (int) (this.getHeight() - otherShape.getHeight());
	}

	public int compare(shapes shape1, shapes shape2, char compareType) {
		switch (compareType) {
		case 'v':
			double volume1 = shape1.ReturnVolume();
			double volume2 = shape2.ReturnVolume();
			return Double.compare(volume1, volume2);

		case 'a':
			double area1 = shape1.ReturnSurfaceArea();
			double area2 = shape2.ReturnSurfaceArea();
			return Double.compare(area1, area2);

		default:
			return Double.compare(shape1.height, shape2.height);
		}
	}
}

