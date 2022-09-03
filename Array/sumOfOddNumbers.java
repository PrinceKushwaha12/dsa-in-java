
// sum of odd numbers [condition :  length entread by the user ]
import java.util.*;

public class sumOfOddNumbers {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter a numbers of range : ");
			int range = sc.nextInt(); // range
			int sum = 0;
			for (int i = 1; i <= range; i++) {
				if (i % 2 == 1) {
					sum = sum + i; // sum of odd numbers
				};
			};

			System.out.print("sum of odd numbers : " + sum + "\n");
		};
	};
};