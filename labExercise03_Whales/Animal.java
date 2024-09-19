/**
 * 
 */
package labExercise03_Whales;

/**
 * This is the Animal class
 */
public class Animal {
	
	// Instance variables
	
	private String name;
	
	// Constructors
	
	/**
	 * Default constructor
	 */
	public Animal () {
		
	}
	
	
	
	/**
	 * Constructor with args
	 * @param name
	 */
	public Animal(String name) {
		super();
		this.name = name;
	}



	// Getters and setters

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	// toString method
	
	/**
	 * toString method for Animal class
	 */
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	
	
	

}
