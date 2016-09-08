package ssw567.team2.assignment1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class TriangleTest {

	Triangle tester;
	
	@Before
	public void setUp() throws Exception {
		
		tester = new Triangle();
		
	}
	
	@Test
	public void isoscelesTest() {

		assertEquals("Isosceles", tester.classifyTriangle(3,3,5));
		assertEquals("Isosceles", tester.classifyTriangle(3,5,3));
		assertEquals("Isosceles", tester.classifyTriangle(5,3,3));
		
	}

	@Test
	public void scaleneTest() {

		assertEquals("Scalene", tester.classifyTriangle(1,2,3));
		assertEquals("Scalene", tester.classifyTriangle(2,3,1));
		assertEquals("Scalene", tester.classifyTriangle(3,1,2));

	}

	@Test
	public void equilateralTest() {

		assertEquals("Equilateral", tester.classifyTriangle(3,3,3));

	}

	@Test
	public void invalidTriangleTest() {

		// Negative Numbers for each parameter
		assertEquals("Not a", tester.classifyTriangle(-1,4,8));
		assertEquals("Not a", tester.classifyTriangle(4,-1,8));
		assertEquals("Not a", tester.classifyTriangle(4,8,-1));
		
		// Zeros for each parameter
		assertEquals("Not a", tester.classifyTriangle(0,4,8));
		assertEquals("Not a", tester.classifyTriangle(4,0,8));
		assertEquals("Not a", tester.classifyTriangle(4,8,0));
		
		// Not a Triangle
		assertEquals("Not a", tester.classifyTriangle(1,2,4));
		assertEquals("Not a", tester.classifyTriangle(2,4,1));
		assertEquals("Not a", tester.classifyTriangle(4,1,2));

	}
	
	@Test
	public void trueRightAngleTest() {
		
		assertEquals(true, tester.isRightAngle(3, 4, 5));
		assertEquals(true, tester.isRightAngle(4, 5, 3));	
		assertEquals(true, tester.isRightAngle(5, 3, 4));

	}
	
	@Test
	public void falseRightAngleTest() {
		
		assertEquals(false, tester.isRightAngle(2, 4, 6));

	}
	
}
