package shapes;
import java.lang.Math;

public class PentagonalPrism {
	double height;
	double edge;
	
	public PentagonalPrism(double theHeight, double edgeLenght) {
		this.height = theHeight;
		this.edge = edgeLenght;
	}
	public double ReturnVolume() {
		return this.ReturnBase()*height;
	}
	public double ReturnSurfaceArea() {
		return 2*(this.ReturnBase()) + 4*(edge*height);
	}
	public double ReturnBase() {
		return (this.PentagonRadius()*edge)/2;
	}
	public double PentagonRadius() {
		return (edge/2)/Math.tan(36);
	}
}
