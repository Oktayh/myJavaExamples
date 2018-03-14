import java.util.Scanner;
public class volume {

	// Densities in gr / cm3
	public static final double ALUMINUM_DENSITY = 2.70;	// Al
	public static final double COPPER_DENSITY = 8.96;	// Cu
	public static final double GOLD_DENSITY = 19.3;		// Au
	public static final double IRON_DENSITY = 7.87;		// Fe
	public static final double SILVER_DENSITY = 10.5;	// Ag

	public static final double ERROR_TOLERANCE = 0.5;

	public static void main(String[] args) {

		metalTest("2472,43  1,0  100,0");		// Fe
		metalTest("6192,0  	2,0  8,0  20,0");	// Au
		metalTest("288,9   3,0");				// Ag
		metalTest("64,08   0,5  30");			// Al
		metalTest("560,0   0,1  25,0  25,0");	// Cu
		metalTest("999,0   4,0");				// Unknown
	}

	public static void metalTest(String input) {
		String metal;
		Scanner console = new Scanner(input);
		double density;
		double counter=0;
		double[] Volume ={0,0,0};
		double mass = console.nextDouble();
		Volume[0] = console.nextDouble();
		// determining the shape if volume has 1 value its going to be cube 2- cylinder 3-rectangular prism.
		counter = cubeVolume(Volume[0]);
		if(console.hasNextDouble())
		{
			Volume[1] = console.nextDouble();
			counter = cylinderVolume(Volume[0],Volume[1]);
		}

		if(console.hasNextDouble()){

			Volume[2] = console.nextDouble();
			counter = rectangularPrismVolume(Volume[0],Volume[1],Volume[2]);
		}

		density = mass / counter;
		metal = density2metal(density);
		System.out.println("This metal is " + metal);


	}

	public static double cylinderVolume(double r, double h) {



		return Math.PI*r*r*h;
	}

	public static double cubeVolume(double x) {


		return x*x*x;
	}

	public static double  rectangularPrismVolume(double x, double y, double z) {

		return x*y*z;

	}

	public static String density2metal(double density) {
		if(density <= ALUMINUM_DENSITY + ERROR_TOLERANCE && density >= ALUMINUM_DENSITY - ERROR_TOLERANCE)
			return "Al";
		if(density <= COPPER_DENSITY + ERROR_TOLERANCE && density >= COPPER_DENSITY - ERROR_TOLERANCE)
			return "Cu";
		if(density <= GOLD_DENSITY + ERROR_TOLERANCE && density >= GOLD_DENSITY - ERROR_TOLERANCE)
			return "Au";
		if(density <= IRON_DENSITY + ERROR_TOLERANCE && density >= IRON_DENSITY - ERROR_TOLERANCE)
			return "Fe";
		if(density <= SILVER_DENSITY + ERROR_TOLERANCE && density >= SILVER_DENSITY - ERROR_TOLERANCE)
			return "Ag";

		return "Unknown";
	}



}
