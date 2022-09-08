/* check sorted and rotated array */
public class checkSortedRotated {
	public static int checkRotated(int arr[], int size) {
		int count = 0;
		for(int i = 1; i < size; i++) {
			if(arr[i - 1] > arr[i]) {
				count++; // count array mach
			};
		};
		// count == 1 an0 more than 1 ans is rotated
		return count;
	};

	public static int checkSorted(int arr[], int size) {
		for(int i = 1; i < size; i++) {
			if(arr[i - 1] < arr[i]) {
				return 1;
			};
		};
		return -1;
	};

	public static void main(String[] args) {
		int arr[] = {9, 2, 3, 4, 5, 6, 7};
		int size = arr.length;
		int ans = checkRotated(arr, size); // call rotated
		int ans2 = checkSorted(arr, size); // call sort
		
		if(ans2 == 1) {
			System.out.println("array is sorted ?");
		}else {
			System.out.println("array is not sorted ?");
		};

		if(ans == 1) {
			System.out.println("array is rotated ?");
		}else {
			System.out.println("array is not rotated");
		};

	}
}
