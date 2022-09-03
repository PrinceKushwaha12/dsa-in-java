/* time complaxity O(n^2) */
public class InsertionSort {
	public static void sort(int arr[]) {
		/* use while Loop */
		// int i = 1; 
		// while(i < arr.length) {
		// 	int current = arr[i];
		// 	int j = i - 1;
		// 	while(j >= 0 && current < arr[j]) {
		// 		arr[j + 1] = arr[j];
		// 		j--;
		// 	};
		// 	arr[j + 1] = current;
		// 	i++;
		// };

		/* use for loop */
		for(int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			for(; j >= 0 && current < arr[j]; j--) {
				arr[j + 1] = arr[j];
			};
			arr[j + 1] = current;
		};
	};

	/* print array */
	public static void printArray(int arr[]) {
		int i = 0; 
		System.out.print("sorted array is : ");
		while(i < arr.length) {
			System.out.print(arr[i] + " ");
			i++;
		}System.out.print("\n");
	};

	public static void main(String args[]) { 
	int arr[] = {1, 3, 9, 4, 5};
	sort(arr); // sort 
	printArray(arr); //print
	};
};