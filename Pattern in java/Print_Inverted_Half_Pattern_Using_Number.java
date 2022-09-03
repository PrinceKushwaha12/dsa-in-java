// Print Inverted Half Pattern Using Numbers 
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3 
// 1 2 
// 1 

import java.util.Scanner;

public class Print_Inverted_Half_Pattern_Using_Number {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user
			System.out.print("Enter Colum Number : ");
			int colum = sc.nextInt(); // input colum by user

			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= colum - i + 1; j++) {
					System.out.print(j + " ");
				}
				System.out.print("\n");
			};
		};
	};
};