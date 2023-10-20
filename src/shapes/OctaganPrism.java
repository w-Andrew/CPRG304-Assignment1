package shapes;
import java.lang.Math;

public class OctaganPrism extends shapes{
	double height;
	double edge;
	
	public OctaganPrism(double theHeight, double edgeLenght) {
		this.height = theHeight;
		this.edge = edgeLenght;
	}
	public double ReturnVolume() {
		return this.ReturnBase()*height;
	}
	public double ReturnBase() {
		return (edge*edge*2*(1+Math.sqrt(2)));
	}
	public double ReturnBaseArea() {
		return (ReturnBase());
	}
}
