//Application returns array elements on odd positions
public class OddPositions {

	// method return an int array with only the element on odd positions
	public int[] selectOdd(int[] arr) {

		// creating a new array which takes the elements on the
		// odd positions of the original array
		int[] arr2 = new int[arr.length];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			// add to new array only elements that are odd, i.e., modulus is not zero
			if ((i % 2) != 0) {
				arr2[j++] = arr[i];
			}
		}

		// creating a third array that resizes the second array to the correct size of
		// the original one
		int[] finalArr = new int[j];
		for (int k = 0; k < j; k++) {
			finalArr[k] = arr2[k];
		}
		return finalArr;
	}

	public static void main(String[] args) {

		// initialising the OddPositions class
		OddPositions wtc = new OddPositions();

		/*
		 * creating an int array variable, which is then looped over, writing out the
		 * result
		 */
		int[] result = wtc.selectOdd(new int[] { 2, 57, 4, 11, 1, 3, 22, 33, 45 });
		
		System.out.print("{");
		
		for (int i = 0; i < result.length; i++) {
			// conditional statement so there is no comma/space after the last element
			if (i == result.length - 1) {
				System.out.print(result[i]);
			} else
				System.out.print(result[i] + ", ");
		}

		System.out.println("}");
	}
}
