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
 * A simple singleton base class to show how singletons
 * and subclassing work
 * 
 * @author orlando
 * @author saran
 */
public class BaseSingleton {	
	/**
	 * Singleton instance
	 */
	private static BaseSingleton instance;

	/**
	 * Singleton request
	 * 
	 * @return the singleton instance
	 */
	public static BaseSingleton getInstance() {
		if (instance == null) {
			instance = new BaseSingleton();
		}
		return instance;
	}
	
	/**
	 * Sets someState to newValue
	 */
	protected void setSomeState(int newValue) {
		someState = newValue;
	}

	/**
	 * Returns value of someState
	 */
	public int getSomeState() {
		return someState;
	}

	/**
	 * Simple function that sets state, will get overwritten
	 */
	public void doSomething() {
		setSomeState(1);
	}
	
	/**
	 * State variable used for testing
	 */
	private int someState = 0;
	
	/**
	 * Private constructor for singleton
	 * Change access modifier to protected to extend BaseSingleton class
	 */
	protected BaseSingleton() {
	}
}
