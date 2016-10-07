package ssw567.team2.assignment5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
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

		assertEquals("failure - should be Scalene", "Scalene", tester.classifyTriangle(6, 5, 4));

	}

	// 	Test that "right" triangles are identified correctly
	@Test
	public void trueRightAngleTest() {
		
		assertTrue("failure - should be true", tester.isRightTriangle(3, 4, 5)); 
		assertTrue("failure - should be true", tester.isRightTriangle(5, 3, 4));
		assertTrue("failure - should be true", tester.isRightTriangle(3, 5, 4));
		
	}
	
	// 	Test that non "right" triangles are identified correctly
	@Test
	public void falseRightAngleTest() {
		
		assertFalse("failure - should be false", tester.isRightTriangle(6, 5, 4)); 

	}

	// Test for Right Scalene triangle 
	@Test
	public void rightScaleneTest() {

		assertEquals("failure - should be Right Scalene", "Right Scalene", tester.classifyTriangle(3, 4, 5));

	}

	//	Test for Right Isosceles triangle
	@Test
	public void rightIsoscelesTest() {

		assertEquals("failure - should be Right Isosceles", "Right Isosceles", tester.classifyTriangle(1,1,Math.sqrt(2)));

	}
	
	// Test for Precision
	@Test
	public void precisionTest() {

		// Test boundary success
		assertTrue("failure - should be true", tester.precisionCompare(1, 1.00));
		assertTrue("failure - should be false", tester.precisionCompare(1, 1.01));
		assertTrue("failure - should be true", tester.precisionCompare(1, .99));
		
		// Test boundary failures
		assertFalse("failure - should be false", tester.precisionCompare(1, 1.02));
		assertFalse("failure - should be false", tester.precisionCompare(1, .98));
		
	}
}
