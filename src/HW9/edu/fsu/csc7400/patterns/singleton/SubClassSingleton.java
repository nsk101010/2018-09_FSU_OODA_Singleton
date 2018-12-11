/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 9 - Singleton Problems
 * 
 * Date: 2017-11-11
 */
package HW9.edu.fsu.csc7400.patterns.singleton;

/**
 * Subclassed singleton. Will set the state to different value
 * 
 * @author orlando
 */
public class SubClassSingleton extends BaseSingleton {

	/**
	 * Simple function that sets state
	 */
	@Override
	public void DoSomething() {
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

	/**
	 * Single constructor must be private
	 */
	private SubClassSingleton() {
	}
}
