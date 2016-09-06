package ssw567.team2.assignment1;

public class Triangle {

	public static String classifyTriangle(int a, int b, int c) {
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
		
		if (triType == "Scalene") {
			if (a*a + b*b == c*c) {
				angleType = " right";
			}
		}
		
		return angleType + " " + triType;
	}

	public static void main(String[] args) {
		String answer = classifyTriangle(1,2,4);
		System.out.println("Sides of 1,3,4 - " + answer + " triangle");

		answer = classifyTriangle(3,3,3);
		System.out.println("Sides of 3,3,3 - " + answer + " triangle");

		answer = classifyTriangle(3,3,5);
		System.out.println("Sides of 3,3,5 - " + answer + " triangle");

		answer = classifyTriangle(1,2,3);
		System.out.println("Sides of 1,2,3 - " + answer + " triangle");

		answer = classifyTriangle(3,4,5);
		System.out.println("Sides of 3,4,5 - " + answer + " triangle");
	}

}
