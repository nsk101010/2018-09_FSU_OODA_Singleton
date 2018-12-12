package HW9.edu.fsu.csc7400.patterns.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * BaseSingletonTest will do a basic test of the base singleton
 * 
 * @author orlando
 * @author saran,vamsi,raghu
 */
class SubClassSingletonTest {
	
	private SubClassSingleton singleton;

	/**
	 * Add casting type to fix subclass from the instance creation.
	 */

	@BeforeEach
	void setUp() throws Exception {
		singleton = (SubClassSingleton) SubClassSingleton.getInstance();
	}
	/**
	 *Update test condition to pass the GetInstance check.
	 */
	@Test
	void testGetInstance() {
		assertEquals(
				1,
				SubClassSingleton.getInstance().getSomeState());
	}

	@Test
	void testSetSomeState() {
		singleton.setSomeState(3);
		assertEquals(
				3,
				singleton.getSomeState());
	}

	@Test
	void testGetSomeState() {
		singleton.setSomeState(-1);
		assertEquals(
				-1,
				singleton.getSomeState());
	}

	@Test
	void testDoSomething() {
		singleton.doSomething();
		assertEquals(
				2,
				singleton.getSomeState());
	}

	@Test
	void testNewFunction() {
		assertEquals(
				100,
				singleton.newFunction());
	}

}
