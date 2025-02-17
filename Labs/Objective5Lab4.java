import java.util.Scanner;

	public class Objective5Lab4 {
		public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int num = 6;

		System.out.println("please enter a number:");
		num = keyboard.nextInt(); 


		if(num % 2 == 0) {
			System.out.println("The number is Positive"); 
		}
		else {
			System.out.println("The number is negative");
		}
		keyboard.close();
	}
}




