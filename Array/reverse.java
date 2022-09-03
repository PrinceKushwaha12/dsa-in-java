import java.util.Scanner;

public class reverse {
	public static void reverseArray(int arr[], int size) {
		int start = 0; // indix = 0
		int end = size - 1; // index = last index
		while (start < end) {
			int temp = arr[start]; // swap now
			arr[start] = arr[end];
			arr[end] = temp;
			start++; // increment starting point
			end--; // decrement starting point
		};
	};

	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Array Size : ");
			int size = sc.nextInt(); // size

			System.out.print("Enter Array : ");
			int arr[] = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt(); // input array
			};

			reverseArray(arr, size); // fun call

			for (int i = 0; i < size; i++) {
				System.out.print(arr[i] + " "); // print array
			};
		}System.out.print("\n");
	};
};