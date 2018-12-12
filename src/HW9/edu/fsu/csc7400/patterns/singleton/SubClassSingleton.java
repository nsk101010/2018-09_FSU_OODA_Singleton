/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9 - Singleton Problems
 * 
 * Date: 2017-11-11
 * 
 * @saran,vamsi,raghu 
 * 
 */
package HW9.edu.fsu.csc7400.patterns.singleton;

/**
 * Subclassed singleton. Will set the state to different value
 * 
 * @author orlando
 * @author saran
 */
public class SubClassSingleton extends BaseSingleton {

	/**
	 * Simple function that sets state
	 */
	@Override
	public void doSomething() {
		setSomeState(2);
	}

	/**
	 * This is a new function which will print a message
	 * 
	 * @returns 100
	 */
	public int newFunction() {
		System.out.println("NewFunction printout");
		return 100;
	}

	public SubClassSingleton() {
	}
	/**
	 * Single constructor must be private. 
	 * Holds singleton instance of type SubClassSingleton
	 */
	private static SubClassSingleton instance;

	/**
	 * Creating instance of SubClassSingleton using getInstance() method and returning
	 * singleton instance.
	 */
	public static synchronized BaseSingleton getInstance() {
		if (instance == null)
		instance = new SubClassSingleton();
		return instance;
	}
}
