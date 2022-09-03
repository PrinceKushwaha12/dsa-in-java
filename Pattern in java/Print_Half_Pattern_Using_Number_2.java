// Print Half Pattern Using Number -2 
// 1
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5

import java.util.Scanner;

public class Print_Half_Pattern_Using_Number_2 {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user

			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(i + " ");
				}
				System.out.print("\n");
			};
		};
	};
};