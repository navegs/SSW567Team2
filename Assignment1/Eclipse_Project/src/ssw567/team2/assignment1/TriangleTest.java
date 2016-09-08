package ssw567.team2.assignment1;

import junit.framework.TestCase;

public class TriangleTest extends TestCase {
		
	public void testClassifyTriangle() {
		
		Triangle t1 = new Triangle();
		
		// negative values 
		assertEquals("Not a", t1.classifyTriangle(-1,-1,-1));	

		assertEquals("Not a", t1.classifyTriangle(1,2,4));
		assertEquals("Not a", t1.classifyTriangle(2,4,1));
		assertEquals("Not a", t1.classifyTriangle(4,1,2));
		
		assertEquals("Equilateral", t1.classifyTriangle(3,3,3));
		
		assertEquals("Isosceles", t1.classifyTriangle(3,3,5));
		assertEquals("Isosceles", t1.classifyTriangle(3,5,3));
		assertEquals("Isosceles", t1.classifyTriangle(5,3,3));
		
		assertEquals("Scalene", t1.classifyTriangle(1,2,3));
		assertEquals("Scalene", t1.classifyTriangle(2,3,1));
		assertEquals("Scalene", t1.classifyTriangle(3,1,2));

		assertEquals("right Scalene", t1.classifyTriangle(3,4,5));	
		assertEquals("right Scalene", t1.classifyTriangle(4,5,3));	
		assertEquals("right Scalene", t1.classifyTriangle(5,3,4));	
	}
}
