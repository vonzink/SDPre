
import java.util.Scanner;

public class Objective4Lab1 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("what is your first name?");
		String fname = keyboard.nextLine(); 

		System.out.println("what is your last name?");
		String lname = keyboard.nextLine();

		System.out.println("what is your favorite animal?");
		String favoriteAnimal = keyboard.nextLine();

		System.out.println("what is your favorite food?");
		String favoriteFood = keyboard.nextLine(); 

		System.out.println("what is your favorite song?");
		String favoriteSong = keyboard.nextLine(); 


		System.out.println("My name is " + fname + " " + lname);
		System.out.println("My favorite animal is " + fname);
		System.out.println("My favorite food is " + fname);
		System.out.println("My favorite song is " + fname);

	keyboard.close();
	}
}

