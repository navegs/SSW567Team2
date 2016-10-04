package ssw567.team2.assignment4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;

public class ImprovedTriangleTest {
	ImprovedTriangle tester;

	@Before
	public void setUp() throws Exception {
		/* Instantiate new Triangle object before each test */
		
		tester = new ImprovedTriangle();
		
	}
	
	// 	If all three sides are equal, return 'Equilateral' 
	@Test
	public void equilateralTest() {

		assertEquals("failure - should be Equilateral", "Equilateral", tester.classifyTriangle(3, 3, 3));

	}

	// 	If exactly one pair of sides are equal, return 'Isoceles'
	//  Scott - Corrected Isosceles spelling from Isoceles
	@Test
	public void isoscelesTest() {

		assertEquals("failure - should be Isosceles", "Isosceles", tester.classifyTriangle(3, 3, 5));
		assertEquals("failure - should be Isosceles", "Isosceles", tester.classifyTriangle(3, 5, 3));
		assertEquals("failure - should be Isosceles", "Isosceles", tester.classifyTriangle(5, 3, 3));
		
	}
	
	// 	Test for invalid triangle scenarios
	@Test
	public void invalidTriangleTest() {

		// Input Out of Bounds Test: Zero & Negative Number (i.e. < 0) Test for each parameter
		assertEquals("failure - should be InvalidInput", "InvalidInput", tester.classifyTriangle(-1, 4, 8));
		assertEquals("failure - should be InvalidInput", "InvalidInput", tester.classifyTriangle(4, -1, 8));
		assertEquals("failure - should be InvalidInput", "InvalidInput", tester.classifyTriangle(4, 8, -1));

		
		// Input Out of Bounds Test: > 200 Test for each parameter
		assertEquals("failure - should be InvalidInput", "InvalidInput", tester.classifyTriangle(201, 4, 8));
		assertEquals("failure - should be InvalidInput", "InvalidInput", tester.classifyTriangle(4, 201, 8));
		assertEquals("failure - should be InvalidInput", "InvalidInput", tester.classifyTriangle(4, 8, 201));		
		
		// Input Out of Bounds Test: Zeros for each parameter
		assertEquals("failure - should be InvalidInput", "InvalidInput", tester.classifyTriangle(0, 4, 8));
		assertEquals("failure - should be InvalidInput", "InvalidInput", tester.classifyTriangle(4, 0, 8));
		assertEquals("failure - should be InvalidInput", "InvalidInput", tester.classifyTriangle(4, 8, 0));

	}
	
	// 	Test for not a triangle triangle scenarios
	@Test
	public void notATriangleTest() {
		
		// Not a Triangle
		assertEquals("failure - should be Not a", "NotATriangle", tester.classifyTriangle(1, 2, 4));
		assertEquals("failure - should be Not a", "NotATriangle", tester.classifyTriangle(2, 4, 1));
		assertEquals("failure - should be Not a", "NotATriangle", tester.classifyTriangle(4, 1, 2));

	}
	
	// Not a requirement but BuggyTriangle code outputs this, so testing for it	
	// Test for Scalene triangle triangle scenarios
	@Test
	public void scaleneTriangleTest() {
		
		// Scalene Triangle
		assertEquals("failure - should be Scalene", "Scalene", tester.classifyTriangle(6, 5, 4));

	}

	// 	If the sum of any two sides equals the square of the third side, then return 'Right'
	//
	// Connie - invalid definition of right
	@Test
	public void trueRightAngleTest() {
		
		// Since there is no separate method within the class to test for right Triangle
		// We must test for the value of "Right" in the returned string
		assertTrue("failure - should be contain 'Right'", tester.classifyTriangle(3, 4, 5).contains("Right")); 

	}
	
}
