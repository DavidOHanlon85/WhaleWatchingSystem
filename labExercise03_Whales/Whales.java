/**
 * 
 */
package labExercise03_Whales;

/**
 * 
 */
public class Whales extends Animal {

	// Instance variables

	private String mainOcean;
	private int weight;
	private int maxSpeed;
	private int length;

	// Constructors

	/**
	 * Default constructor
	 */
	public Whales() {

	}

	/**
	 * Constructor with params
	 * 
	 * @param name
	 * @param mainOcean
	 * @param weight
	 * @param maxSpeed
	 * @param length
	 */
	public Whales(String name, String mainOcean, int weight, int maxSpeed, int length) {
		super(name);
		this.mainOcean = mainOcean;
		this.weight = weight;
		this.setMaxSpeed(maxSpeed);
		this.length = length;
	}

	// Getters and setters

	/**
	 * @return the mainOcean
	 */
	public String getMainOcean() {
		return mainOcean;
	}

	/**
	 * @param mainOcean the mainOcean to set
	 */
	public void setMainOcean(String mainOcean) {
		this.mainOcean = mainOcean;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed > 0 && maxSpeed <= 60) {
			this.maxSpeed = maxSpeed;
		} else {
			System.out.println("Invalid input");
			this.maxSpeed = -1;
		}
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	// toString method

	/**
	 * This is a toString method for the Whales class
	 */
	@Override
	public String toString() {
		return "Whales [mainOcean=" + mainOcean + ", weight=" + weight + ", maxSpeed=" + maxSpeed + ", length=" + length
				+ ", getName()=" + getName() + "]";
	}

}
