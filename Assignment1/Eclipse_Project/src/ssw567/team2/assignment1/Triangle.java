package ssw567.team2.assignment1;

public class Triangle {

	public String classifyTriangle(int a, int b, int c) {
		String triType = "unknown";
		String angleType = "";
		
		if ((a+b < c) || (a+c < b) || (b+c < a)) {
			triType = "Not a"; // one side must be < sum of other 2
		}
		else if ((a==b) && (b==c)) {
			 triType = "Equilateral"; // all 3 sides are equal
		}
		else if ((a==b) || (a==c) || (b == c)) {
			 triType = "Isosceles"; // 2 sides are equal
		}
		else if ((a != b) || (a != c) || (b != c)) {
			 triType = "Scalene"; // all 3 sides are different
		}
		
		if (isRightAngle(a, b, c)) {
			angleType = "Right ";
		}
		
		return angleType +  triType;
	}

	public boolean isRightAngle(int a, int b, int c) {
		boolean result = false;
		
		if ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)) {
			result = true;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// create new triangle
		Triangle t1 = new Triangle();
		
		String answer = t1.classifyTriangle(0,3,4);
		System.out.println("Sides of 0,3,4 - " + answer + " triangle");
		
		answer = t1.classifyTriangle(4,4,-4);
		System.out.println("Sides of 4,4,-4 - " + answer + " triangle");

		answer = t1.classifyTriangle(1,2,4);
		System.out.println("Sides of 1,3,4 - " + answer + " triangle");

		answer = t1.classifyTriangle(3,3,3);
		System.out.println("Sides of 3,3,3 - " + answer + " triangle");

		answer = t1.classifyTriangle(3,3,5);
		System.out.println("Sides of 3,3,5 - " + answer + " triangle");

		answer = t1.classifyTriangle(1,2,3);
		System.out.println("Sides of 1,2,3 - " + answer + " triangle");

		answer = t1.classifyTriangle(3,4,5);
		System.out.println("Sides of 3,4,5 - " + answer + " triangle");
	}
	
}
