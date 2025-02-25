import java.util.Scanner;

public class Triangle {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is the length of side A");
		int sideA = scanner.nextInt(); 

		System.out.println("What is the length of side B");
		int sideB = scanner.nextInt(); 

			System.out.println("What is the length of side C");
		int sideC = scanner.nextInt(); 

		//Pythagorean Theorem

		int a = (sideA * sideA);
		int b = (sideB * sideB);
		int c = (sideC * sideC);

		if ((a + b == c) || (a + c == b) || (b + c == a)){
			System.out.println("this is a right triange");
		}
		else if ((a == b && b == c)){
			System.out.println("this is an equalateral triange");
		}
		else if ((a == b)||(b == c)|| (a == c)){
			System.out.println("this is an isosceles triange");
		}
		else {
		System.out.println("this is an scalene triange");
		}
	}
}
