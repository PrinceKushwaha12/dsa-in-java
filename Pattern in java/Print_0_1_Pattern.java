
// Print 0 and 1 Pattern 
// 1 
// 0 1 
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
import java.util.Scanner;

public class Print_0_1_Pattern {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user
			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= i; j++) {
					if ((i + j) % 2 == 1) {
						System.out.print("0" + " ");
					} else {
						System.out.print("1" + " ");
					};
				}System.out.print("\n");
			};
		};
	};
};