// importing java.util to access Scanner class
import java.util.*;

// Program that indicates whether a number is a multiple of 3 or of 7
public class FindingMultiples {

	// prints out all numbers from 1 to 100, whilst indicating which ones
	// are multiples of 3 or 7
	public static void multipleReplacement(int multiplesOf, int range) {

		System.out.println("The multiples of " + multiplesOf + " from 1 to " + range + " are:");

		// loop over range and print out the multiples of the chosen integer
		for (int i = 1; i <= range; i++) {
			if (i % multiplesOf == 0) {
				System.out.print(i + " ");
			}
		}
	}

	// main method
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// creates variables for multiple from user input
		System.out.println("Please enter the integer to find its multiples> ");
		int multiplesOf = scan.nextInt();

		// creates variable for range from user input
		System.out.println("Please choose the range> ");
		int range = scan.nextInt();

		// invoking static method
		multipleReplacement(multiplesOf, range);

		// closing Scanner
		scan.close();
	}
}
