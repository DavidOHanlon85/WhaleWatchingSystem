/**
 * 
 */
package labExercise03_Whales;

/**
 * This is a test driver for the Animal and Whales class
 */
public class WhaleWatcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Whales w1 = new Whales("Right", "Atlantic", 2001, 21, 16);
		Whales w2 = new Whales("Blue", "Pacific", 2001, 23, 16);
		Whales w3 = new Whales("Sperm", "Atlantic", 1900, 20, 40);
		Whales w4 = new Whales("Humpback", "Antarctic", 919, 13, 13);
		
		// Store 4 Whales as an array
		
		Whales[] whales = new Whales[] {w1, w2, w3, w4};
		
		// Output all details for Whales
		
		displayAll(whales);
		
		// Output the names of the whales that mostly swim in the Atlantic
		
		String targetZone = "Atlantic";
		
		whalesInTargetZone(whales, targetZone);
		
		// Output the name of the fastest Whale
		
		String fastestWhale = fastestWhale(whales);
		System.out.println("The fastest whale is the : " + fastestWhale);
		System.out.println();
		
		// Average length of whales
		
		double average = averageLengthOfWhales(whales);
		System.out.println("The average length of whales is : " + average + "meters");
		System.out.println();
		
		// Output the heaviest whale
		
		//String heaviestWhale = heaviestWhale(whales);
		//System.out.println("The heaviest whale is : " + heaviestWhale);
		
		System.out.println("The heaviest whale/ whales is/ are : ");
		heaviestWhale(whales);
		
	}

	/**
	 * This method returns the name of the heaviest whale
	 * @param whales
	 */
	public static void heaviestWhale(Whales[] whales) {
		String heaviestWhale = whales[0].getName();
		int currentHeaviestWhale = whales[0].getWeight();
		
		for (int i = 0; i < whales.length; i++) {
			if (whales[i].getWeight() > currentHeaviestWhale) {
				currentHeaviestWhale = whales[i].getWeight();
				heaviestWhale = whales[i].getName();
			}
		}
		
		for (int i = 0; i < whales.length; i++) {
			if (whales[i].getWeight() == currentHeaviestWhale) {
				System.out.println(whales[i].getName());
			}
		}
	}

	/**
	 * This method calculates the average of the length of whales and returns this average
	 * @param whales
	 * @return
	 */
	public static double averageLengthOfWhales(Whales[] whales) {
		double average;
		double total = 0;
		
		for (int i = 0; i < whales.length; i++) {
			total += whales[i].getLength();
		}
		
		average = total / whales.length;
		
		return average;
	}

	/**
	 * This method calculates the fastest whale and returns its name
	 * @param whales
	 * @return
	 */
	public static String fastestWhale(Whales[] whales) {
		String fastestWhale = whales[0].getName();
		
		int fastestWhaleSpeed = whales[0].getMaxSpeed();
		
		for (int i = 0; i < whales.length; i++) {
			if(fastestWhaleSpeed < whales[i].getMaxSpeed()) {
				fastestWhaleSpeed = whales[i].getMaxSpeed();
				fastestWhale = whales[i].getName();
			}
		}
		return fastestWhale;
	}

	/**
	 * @param whales
	 * @param targetZone
	 */
	public static void whalesInTargetZone(Whales[] whales, String targetZone) {
		System.out.println("These are the whales that most swim in the " + targetZone + " : ");
		
		for (int i = 0; i < whales.length; i++) {
			if (whales[i].getMainOcean().equalsIgnoreCase(targetZone)) {
				System.out.println(whales[i].getName());
			}
		}
		
		System.out.println();
	}

	/** 
	 * This method displays all information on the whales
	 * @param whales
	 */
	public static void displayAll(Whales[] whales) {
		System.out.println("All whale information");
		
		for (Whales whale : whales) {
			System.out.println(whale.toString());
		}
		
		System.out.println();
	}

}
