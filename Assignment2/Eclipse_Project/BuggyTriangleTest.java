package ssw567.team2.assignment1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class BuggyTriangleTest {
	BuggyTriangle tester;

	@Before
	public void setUp() throws Exception {
		/* Instantiate new Triangle object before each test */
		
		tester = new BuggyTriangle();
		
	}
	
	// 	If all three sides are equal, return 'Equilateral' 
	@Test
	public void equilateralTest() {

		assertEquals("failure - should be Equilateral", "Equilateral", tester.classifyTriangle(3, 3, 3));

	}

	// 	If exactly one pair of sides are equal, return 'Isoceles' // Connie - misspelled
	@Test
	public void isoscelesTest() {

		assertEquals("failure - should be Isoceles", "Isoceles", tester.classifyTriangle(3, 3, 5));
		assertEquals("failure - should be Isoceles", "Isoceles", tester.classifyTriangle(3, 5, 3));
		assertEquals("failure - should be Isoceles", "Isoceles", tester.classifyTriangle(5, 3, 3));
		
	}
	
	// 	If not a valid triangle, then return 'NotATriangle'
	@Test
	public void invalidTriangleTest() {

		// Negative Numbers for each parameter
		assertEquals("failure - should be Not a", "NotATriangle", tester.classifyTriangle(-1, 4, 8));
		assertEquals("failure - should be Not a", "NotATriangle", tester.classifyTriangle(4, -1, 8));
		assertEquals("failure - should be Not a", "NotATriangle", tester.classifyTriangle(4, 8, -1));
		
		// Zeros for each parameter
		assertEquals("failure - should be Not a", "NotATriangle", tester.classifyTriangle(0, 4, 8));
		assertEquals("failure - should be Not a", "NotATriangle", tester.classifyTriangle(4, 0, 8));
		assertEquals("failure - should be Not a", "NotATriangle", tester.classifyTriangle(4, 8, 0));

		// Not a Triangle
		assertEquals("failure - should be Not a", "NotATriangle", tester.classifyTriangle(1, 2, 4));
		assertEquals("failure - should be Not a", "NotATriangle", tester.classifyTriangle(2, 4, 1));
		assertEquals("failure - should be Not a", "NotATriangle", tester.classifyTriangle(4, 1, 2));

	}
	
	// 	If the sum of any two sides equals the square of the third side, then return 'Right' // Connie - invalid definition of right
	@Test
	public void trueRightAngleTest() {
		
		// tested correctly despite invalid definition
		assertEquals("failure - should be true", "Right", tester.classifyTriangle(3, 4, 5)); 
		assertEquals("failure - should be true", "Right", tester.classifyTriangle(4, 5, 3)); 
		assertEquals("failure - should be true", "Right", tester.classifyTriangle(5, 3, 4));

	}
	
}
