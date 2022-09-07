/**
 * rotetedArray
 */
public class rotetedArray {
	
	/* rotated array */
	public static void rotated(int arr[], int size, int position) {
		
		int temp[] = new int[size];
		int k = 0;

		// store the temp array position till the end
		for(int i = position ; i < size; i++) {
			temp[k] = arr[i];
			k++;
		};

		// store the temp array index 0 till position
		for(int i = 0; i < position; i++) {
			temp[k] = arr[i];
			k++;
		}

		// after copy the temp element value in real array 
		for(int i = 0; i < size; i++) {
			arr[i] = temp[i];
		};

	};

	/* print array  */
	public static void print(int arr[], int size) {
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i]);
		}System.out.println();
	};

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; // simple array 
		int size = arr.length; // array size 
		int position = 2; // position to rotated array 
		rotated(arr, size, position); // rotated function call
		print(arr, size); // print function call
	};
};