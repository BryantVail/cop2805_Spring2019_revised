package week00;

/**
 * 
 * @author BVAIL
 * @version 1.0 01/11/2019
 *
 */
public class HelloWorld {
	private String name;
	
	/**
	 * constructor
	 */
	public HelloWorld() {
		this.name = "Bryant Vail";
	}
	
	public String getName() {
		return this.name;
	}
	
	/**
	 * @return String
	 * "Hello from <your name>"
	 * 
	 */
	public String display() {
		return ("Hello from "+getName());
	}
	
}
