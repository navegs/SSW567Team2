package ssw567.team2.assignment1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.Before;

public class BuggyTriangleTest {
	BuggyTriangle tester;

	@Before
	public void setUp() throws Exception {
		/* Instantiate new Triangle object before each test */
		
		tester = new BuggyTriangle();
		
	}
	
	// define multiple sets of tests as functions with names that begin 
	// with 'test'.  Each function may include multiple tests

	@Test
	public void testClassifyTriangle1() { // test invalid inputs
		// your tests go here. Include as many tests as you'd like
		assertEquals("3,4,5 is a Right triangle", "Right", tester.classifyTriangle(3, 4, 5));
	}
	
	@Test
	public void testClassifyTriangle2() { 
		// define multiple test sets to test different aspects of the code
		// notice that tests can have bugs too!
		assertEquals("1,1,1 should be equilateral", "Equilateral", tester.classifyTriangle(1, 1, 1));
		assertFalse("Should be Equilateral", "Isoceles"==tester.classifyTriangle(10, 10, 10)); //Connie - bad way to test for this
		assertEquals("Should be Isoceles", "Scalene", tester.classifyTriangle(10,15,30)); // Connie - message is bad, this should be Scalene
	}	
}