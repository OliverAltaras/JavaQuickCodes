package ie.gmit.dip;

//Application that prints a multiplication table for numbers up to 12

//importing the java.util package to use the Scanner class
import java.util.*;

public class MultiplicationTable {

	// Scanner class used for user input
	Scanner scan = new Scanner(System.in);

	// method returns an int, which is then passed as an argument in table()
	public int userInput() {
		int input = scan.nextInt();
		return input;
	}

	// method generates the product of the iteration int and the user input
	public static void table(int input) {
		for (int i = 1; i <= 12; i++) {
			System.out.println(i + " * " + input + " = " + (i * input));
		}
	}

	// main method
	public static void main(String[] args) {

		// creating an instance of MultiplicationTable
		MultiplicationTable mt = new MultiplicationTable();

		// invoking both methods
		System.out.println("Please enter the number you'd like to multiply> ");
		int input = mt.userInput();
		table(input);
	}
}
