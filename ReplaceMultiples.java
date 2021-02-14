// Program that indicates whether a number is a multiple of 3 or of 7
public class ReplaceMultiples {

	// prints out all numbers from 1 to 100, whilst indicating which ones
	// are multiples of 3 or 7
	public static void multipleReplacement() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i + " is a multiple of 3");
			} else if (i % 7 == 0) {
				System.out.println(i + " is a multiple of 7");
			} else
				System.out.println(i);
		}
	}

	// main method
	public static void main(String[] args) {

		// invoking static method
		multipleReplacement();
	}
}
