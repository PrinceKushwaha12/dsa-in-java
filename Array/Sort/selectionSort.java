/* time complaxity O(n^2) */
import java.util.Scanner;
public class selectionSort {
	public static void sort(int arr[], int size) {
		/* while Loop */
		// int i = 0; 
		// while(i < size) {
		// 	int smallest = i;
		// 	int j = i + 1;
		// 	while(j < size) {
		// 		if(arr[smallest] > arr[j]) {
		// 			smallest = j;
		// 		};
		// 		j++;
		// 	}
		// 	int temp = arr[smallest];;
		// 	arr[smallest] = arr[i];
		// 	arr[i] = temp;
		// 	i++;
		// };

		/* For Loop */
		for(int i = 0; i < size; i++) {
			int small = i;
			for(int j = i + 1; j < size; j++) {
				if(arr[small] > arr[j]) {
					small = j;
				};
				int temp = arr[small];
				arr[small] = arr[i];
				arr[i] = temp;
			};
		};
	};

	/* print array */
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

			sort(arr, size); // call function
			printArray(arr, size); // print
		}
	};
};