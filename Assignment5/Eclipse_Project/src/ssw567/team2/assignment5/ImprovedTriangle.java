package ssw567.team2.assignment5;


import java.math.BigDecimal;

 
public class ImprovedTriangle {

	// Number of significant digits that should be used when comparing two sides
	int digits = 2;
	// Tolerance or Precision: Allowed variance between two numbers to be considered equal
	double tolerance = .01;

	
	public String classifyTriangle(double a, double b, double c) {
		/*
		 * This function returns a string with the type of triangle from three integer values
		 * corresponding to the lengths of the three sides of the Triangle.
		 * 
		 * Return:
		 *  - If any side is not between 0 and 200, return "InvalidInput"
		 *  - If all three sides are equal, return 'Equilateral' 
		 *	- If exactly one pair of sides are equal, return 'Isosceles'
		 *  - If not a valid triangle, then return 'NotATriangle'
		 *  - If all sides are different, then return 'Scalene'
		 *  - If the sum of the square of any two sides equals the square of the third side, then return 'Right' in addition to the triangle type 
		 *
		 */
 
		// require that the input values be > 0 and <= 200 
		if (a > 200 || b > 200 || c > 200) { 
			return "InvalidInput";
		}
		
		if (a <= 0 || b <= 0 || c <= 0) { 
			return "InvalidInput";
		}
		

		/*
		   This information was not in the requirements spec but is important for correctness
		   the sum of any two sides must be strictly less than the third side
		   of the specified shape is not a triangle
		*/
		if ((a >= (b+c)) || (b >= (c+a)) || (c >= (a + b))) { 
			return "NotATriangle";
		}
		
		String triType = "";

		// now we know that we have a valid triangle
		if ((a==b) && (b==c)) {
			triType = "Equilateral"; 
		}
		else if ((a == b) || (b == c) || (a == c)) { 
			triType = "Isosceles";  
		}
		else {
			triType = "Scalene"; 
		}

		if (isRightTriangle(a, b, c)) {
			return "Right "+triType;
		} 
		else {
			return triType;
		}			

	}
	
	/*
	 * Method to compare double numbers without rounding errors with a tolerance
	 * 
	 * @param a First number to compare
	 * @param b Second number to compare
	 * 
	 * @return boolean Returns true if the two number values are within the class
	 *                 defined tolerance level
	 */
	public boolean precisionCompare(double a, double b) {
		BigDecimal bd1 = BigDecimal.valueOf(a);
		BigDecimal bd2 = BigDecimal.valueOf(b);
		
		BigDecimal precision = BigDecimal.valueOf(tolerance);
		
		// Used for debugging. Uncomment line below to see comparison output
		// System.out.println(bd1.doubleValue() + " " + bd2.doubleValue() + " (" + Math.abs(bd1.subtract(bd2).doubleValue()) + " : " + (Math.abs(bd1.subtract(bd2).doubleValue()) <= precision.doubleValue()) + ")");
		
		return Math.abs(bd1.subtract(bd2).doubleValue()) <= precision.doubleValue();
	}
	
	/*
	 * Method to identify right triangles
	 */
	public boolean isRightTriangle(double a, double b, double c) {
		if ((precisionCompare((Math.pow(a, 2) + Math.pow(b, 2)), Math.pow(c, 2))) 
				|| (precisionCompare((Math.pow(b, 2) + Math.pow(c, 2)), Math.pow(a, 2))) 
				|| (precisionCompare((Math.pow(c, 2) + Math.pow(a, 2)), Math.pow(b, 2)))) {
			
			return true;
			
		}
		else {
			return false;
		}
	}

	// Run classifyTriangle
	public static void runClassifyTriangle (double a, double b, double c) {
		ImprovedTriangle t1 = new ImprovedTriangle();
		
		System.out.println("classifyTriangle(" + a + "," + b + "," + c + ") = " + t1.classifyTriangle(a, b, c));

	}
	

	// Invoke ImprovedTriangle with the original BuggyTriangle and Extended arguments and print the results
	public static void main(String[] args) {
		
		
		// Original BuggyTriangle input values used
		double[][] originalValues = {
				{1, 2, 3}, 
                {1, 1, 1},
                {3, 4, 5}
        	};
		
		System.out.println("Original BuggyTriangle Input Values");
		System.out.println("------------------------------------");
		
		for(int i = 0; i < originalValues.length; i++) {
			ImprovedTriangle.runClassifyTriangle(originalValues[i][0], originalValues[i][1], originalValues[i][2]); 
		}
		
		
		// Extended input values for additional scenarios
		double[][] extendedValues = {
				{0, 3, 4},
                {4, 4, -4},
                {3, 3, 3},
                {3, 3, 5},
                {6, 5, 4}
        	};

		System.out.println("\n\nExtended ImprovedTriangle Input Values");
		System.out.println("------------------------------------");

		for(int i = 0; i < extendedValues.length; i++) {
			ImprovedTriangle.runClassifyTriangle(extendedValues[i][0], extendedValues[i][1], extendedValues[i][2]);
		}

	}

}
