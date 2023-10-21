package util;

public class Timing {
	public Timing() {
		//example
		long startTime = System.nanoTime();
		//methodToTime();
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.print("Total time taken is ");
		System.out.println(Long.toString(duration));
	}
}