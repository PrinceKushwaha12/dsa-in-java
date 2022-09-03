import java.util.Scanner;

// Sum of all real numbers input by the user 
public class sumOfRealNumbers {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter size : ");
			int arraySize = sc.nextInt(); // input size
			int arr[] = new int[arraySize];

			System.out.print("Enter array : ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt(); // input array
			};

			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i]; // add all array sum
			};
			System.out.print("Sum is : " + sum + "\n"); // printing array sum
		};
	};
};