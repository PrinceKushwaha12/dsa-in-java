
/* maximum and minimum number of array */
import java.util.Scanner;

public class max_min_number {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Array Size : ");
			int size = sc.nextInt(); // size

			System.out.print("Enter Array : ");
			int arr[] = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt(); // input array
			};

			int min = arr[0];
			int max = arr[0];

			for (int i = 0; i < size; i++) {
				if (max < arr[i]) {
					max = arr[i];
				} else {
					min = arr[i];
				};
			};
			System.out.println("minimum number is : " + min);
			System.out.println("maximum number is : " + max);
		};
	};
};