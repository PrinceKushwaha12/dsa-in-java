
// sum of Even numbers [condition :  length entread by the user ]
import java.util.Scanner;

public class sumOfEvenNumbers {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter a numbers of range : ");
			int range = sc.nextInt(); // range
			int sum = 0;
			for (int i = 1; i <= range; i++) {
				if (i % 2 == 0) {
					sum = sum + i; // sum of even numbers
				};
			};
			System.out.print("sum of even numbers : " + sum + "\n");
		}
	};
};