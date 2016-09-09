package ssw567.team2.assignment1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.Before;

public class TriangleTest {

	Triangle tester;
	
	@Before
	public void setUp() throws Exception {
		/* Instantiate new Triangle object before each test */
		
		tester = new Triangle();
		
	}
	
	@Test
	public void isoscelesTest() {

		assertEquals("failure - should be Isosceles", "Isosceles", tester.classifyTriangle(2.4, 2.4, 2.6832));
		assertEquals("failure - should be Isosceles", "Isosceles", tester.classifyTriangle(3, 3, 5));
		assertEquals("failure - should be Isosceles", "Isosceles", tester.classifyTriangle(3, 5, 3));
		assertEquals("failure - should be Isosceles", "Isosceles", tester.classifyTriangle(5, 3, 3));
		
	}

	@Test
	public void scaleneTest() {

		assertEquals("failure - should be Scalene", "Scalene", tester.classifyTriangle(3.4, 3.8, 5.7));
		assertEquals("failure - should be Scalene", "Scalene", tester.classifyTriangle(1, 2, 3));
		assertEquals("failure - should be Scalene", "Scalene", tester.classifyTriangle(2, 3, 1));
		assertEquals("failure - should be Scalene", "Scalene", tester.classifyTriangle(3, 1, 2));

	}

	@Test
	public void rightScaleneTest() {

		assertEquals("failure - should be Right Scalene", "Right Scalene", tester.classifyTriangle(3.0, 4.0, 5.0));
		assertEquals("failure - should be Right Scalene", "Right Scalene", tester.classifyTriangle(3, 4, 5));
		assertEquals("failure - should be Right Scalene", "Right Scalene", tester.classifyTriangle(4, 5, 3));
		assertEquals("failure - should be Right Scalene", "Right Scalene", tester.classifyTriangle(5, 3, 4));

	}

	@Test
	public void equilateralTest() {

		assertEquals("failure - should be Equilateral", "Equilateral", tester.classifyTriangle(3.5, 3.5, 3.5));
		assertEquals("failure - should be Equilateral", "Equilateral", tester.classifyTriangle(3, 3, 3));

	}

	@Test
	public void invalidTriangleTest() {

		// Negative Numbers for each parameter
		assertEquals("failure - should be Not a", "Not a", tester.classifyTriangle(-1, 4, 8));
		assertEquals("failure - should be Not a", "Not a", tester.classifyTriangle(4, -1, 8));
		assertEquals("failure - should be Not a", "Not a", tester.classifyTriangle(4, 8, -1));
		
		// Zeros for each parameter
		assertEquals("failure - should be Not a", "Not a", tester.classifyTriangle(0, 4, 8));
		assertEquals("failure - should be Not a", "Not a", tester.classifyTriangle(4, 0, 8));
		assertEquals("failure - should be Not a", "Not a", tester.classifyTriangle(4, 8, 0));

		// Not a Triangle
		assertEquals("failure - should be Not a", "Not a", tester.classifyTriangle(1, 2, 4));
		assertEquals("failure - should be Not a", "Not a", tester.classifyTriangle(2, 4, 1));
		assertEquals("failure - should be Not a", "Not a", tester.classifyTriangle(4, 1, 2));

	}
	
	@Test
	public void trueRightAngleTest() {
		
		assertTrue("failure - should be true", tester.isRightAngle(3, 4, 5));
		assertTrue("failure - should be true", tester.isRightAngle(4, 5, 3));	
		assertTrue("failure - should be true", tester.isRightAngle(5, 3, 4));

	}
	
	@Test
	public void falseRightAngleTest() {
		
		assertFalse("failure - should be false", tester.isRightAngle(2, 4, 6));

	}
	
}
