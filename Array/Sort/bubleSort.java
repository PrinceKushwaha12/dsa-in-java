/* time complaxity = 0(n^2) */
import java.util.Scanner;
public class bubleSort {
	// public static void sortWithWhileLoop(int arr[], int size) {
	// 	int i = 0; 
	// 	while(i < size) {
	// 		int j = 0; 
	// 		while(j < size - i - 1) {
	// 			if(arr[j] > arr[j + 1]) {
	// 				int temp = arr[j + 1];
	// 				arr[j + 1] = arr[j];
	// 				arr[j] = temp;
	// 			};
	// 			j++;
	// 		};
	// 		i++;
	// 	};
	// };

	public static void sortWithForLoop(int arr[], int size) {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				};
			};
		};
	};

	public static void printArray(int arr[], int size) {
		int i = 0; 
		System.out.print("sorted array is : ");
		while(i < size) {
			System.out.print(arr[i] + " ");
			i++;
		}System.out.print("\n");
	};

	public static void main(String args[]) { 
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Array Size : ");
			int size = sc.nextInt(); // size 

			System.out.print("Enter Array : ");
			int arr[] = new int[size];
			for(int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();  //input array 
			};

			sortWithForLoop(arr, size);
			printArray(arr, size);
		}
	};
};