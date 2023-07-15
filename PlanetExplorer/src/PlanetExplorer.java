
public class PlanetExplorer {
	public double calculateSurfaceArea(double radius) {
		double surfaceArea=4*Math.PI*Math.pow(radius, 2);
		return surfaceArea;
		
	}

	public static void main(String[] args) {
		PlanetExplorer explorer = new PlanetExplorer();
		double radius=3.0;
		double surfaceArea=explorer.calculateSurfaceArea(3.0);
		System.out.printf("%.2f\n",surfaceArea);

	}

}
