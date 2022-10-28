
// dynamic allocate array 
import java.util.Arrays;

public class dynamicAllocation {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Array Size : ");
			int sizeOfArray = sc.nextInt(); // input size by user
			int arr[] = new int[sizeOfArray]; // initialize Dynamic Array
			System.out.print("Enter An Array : ");

			for (int i = 0; i < sizeOfArray; i++) {
				arr[i] = sc.nextInt(); // input array by user
			};

			for (int i = 0; i < sizeOfArray; i++) {
				System.out.print(arr[i] + " "); // printing array
			};
		}System.out.print("\n");
	};
};