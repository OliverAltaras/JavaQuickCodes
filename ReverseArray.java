package ie.gmit.dip;

//Application that reverses the indexes of an array
public class ReverseArray {

	// method returns the reverse array
	public int[] reverser(int[] arr) {

		// creating a second array the same length as the original one
		int[] arr2 = new int[arr.length];

		// counter for the second array
		int j = 0;

		// loop over array from end to start by decreasing the counter
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[j++] = arr[i];

		}

		return arr2;
	}

	// main method
	public static void main(String[] args) {
		ReverseArray wt = new ReverseArray();

		// creating an int array to store the array returned from the reverser() method
		int[] result = wt.reverser(new int[] { 2, 57, 4, 11, 1, 3, 22, 33, 45 });

		// looping over the reversed array and writing out the result
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
