import java.util.Scanner;

public class addToArray {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter array size : ");
			int size = sc.nextInt(); // size of all array
			int arr1[] = new int[size];

			System.out.print("enter a first array : ");
			for (int i = 0; i < size; i++) {
				arr1[i] = sc.nextInt(); // input array one
			};

			int arr2[] = new int[size];

			System.out.print("enter a second array : ");
			for (int i = 0; i < size; i++) {
				arr2[i] = sc.nextInt(); // input array second
			};

			int result = 0;

			for (int i = 0; i < size; i++) {
				result = result + arr1[i]; // sum of first array
			};

			for (int i = 0; i < size; i++) {
				result = result + arr2[i]; // sum of second array
			};

			System.out.println("sum of two array is : " + result);
		}
	};
};