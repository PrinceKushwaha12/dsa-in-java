import java.util.Scanner;

public class leanerSearch {
	public static int leaner(int arr[], int size, int searchNumber) {
		int i = 0;
		while (i < size) {
			if (arr[i] == searchNumber) {
				return i; // number is find also return index
			};
			i++;
		};
		return -1; // not a number find return -1
	};

	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Array Size : ");
			int size = sc.nextInt(); // input size by user
			int arr[] = new int[size]; // initialize Dynamic Array
			System.out.print("Enter An Array : ");

			int i = 0;
			while (i < size) {
				arr[i] = sc.nextInt(); // input array
				i++;
			};
			System.out.print("Enter searching number : ");
			int searchNumber = sc.nextInt(); // input search number
			System.out.println("index is -> " + leaner(arr, size, searchNumber));
		};
	};
};