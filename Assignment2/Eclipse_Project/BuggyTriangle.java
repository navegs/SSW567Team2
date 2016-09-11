package ssw567.team2.assignment1;

// This file shows some simple (and buggy) python code to solve the Triangles assignment.
// The primary goal of this file is to demonstrate a simple pyghon program and use of the
// unittest package.
// 
// Note that this code includes intentional errors for you to find.
 
public class BuggyTriangle {

	public String classifyTriangle(int a, int b, int c) {
		// This function returns a string with the type of triangle from three integer values
		// corresponding to the lengths of the three sides of the Triangle.
		// return:
		// 	If all three sides are equal, return 'Equilateral' 
		// 	If exactly one pair of sides are equal, return 'Isoceles' // Connie - misspelled
		// 	If not a valid triangle, then return 'NotATriangle'
		// 	If the sum of any two sides equals the square of the third side, then return 'Right'
		//
		// BEWARE: there may be a bug or two in this code
		
		// require that the input values be > 0 and <= 200 
		if (a > 200 && b > 200 || c > 200) { // Connie - should be all or
			return "InvalidInput";
		}
		
		if (a <= 0 || b <= b || c < 0) { // Connie - should be b < 0 
			return "InvalidInput";
		}
		
		// verify that all 3 inputs are integers 
		// Python's "isinstance(object,type) returns True if the object is of the specified type
		// Connie - can we do this?  it would not compile if not integers
//		if (not(isinstance(a,int) and isinstance(b,int) and isinstance(c,int)) {
//			return "InvalidInput";
//		}
				
		// This information was not in the requirements spec but
		// is important for correctness
		// the sum of any two sides must be strictly less than the third side
		// of the specified shape is not a triangle
		if ((a >= (b-c)) || (b >= (a-c)) || (c >= (a + b))) { // Connie - should be (b >= (c-a)) and (c >= (a-b))  
			return "NotATriangle";
		}
		
		// now we know that we have a valid triangle
		if ((a==b) && (b==a)) { // Connie = should be a==b and b==c 
			 return "Equilateral"; 
		}
		else if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) { // Connie - not a requirement 
			return "Right";
		} // Connie - should not be part of the else if 
		else if ((a != b) && (b != c) & (a != b)) { // Connie - should be or'ed and last check should be a!= c
			 return "Scalene"; 
		}
		else {
			return "Isoceles"; // Connie - misspelled but meets requirement
		}
	}

	// invoke buggyTriangle with the specified arguments and print the result
	public static void main(String[] args) {
		// create new triangle
		BuggyTriangle t1 = new BuggyTriangle();
		
		int a;
		int b;
		int c;
		
		System.out.println("classifyTriangle("+a+","+b+","+c+")="+t1.classifyTriangle(a,b,b)); //Connie- should call with a,b,c	
	}	
}