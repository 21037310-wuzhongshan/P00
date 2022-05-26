import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: wuzhonngshan
 * Student ID: 21037310
 * Class: W64D
 * Date/Time created: ÐÇÆÚËÄ 26-05-2022 21:35
 */

/**
 * @author User
 *
 */
public class CalculatorTest {
	private int a,b;
	Calculator cal = new Calculator();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		//Arrange
		Calculator cal = new Calculator();
		a =4321;
		b =1234;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testadd() {
		//act
		int actual =cal.add(a, b);
		assertEquals(5555,actual);
	}
	public void testSubtract() {
		int actual = cal.subtract(a, b);
		assertEquals(3087,actual);
	}
	public void testMultiple() {
		int actual = cal.multiple(a, b);
		assertEquals(5332114,actual);
	}
	public void testDivide() {
		int actual = cal.divide(a, b);
		assertEquals(3,actual);
	}

}
