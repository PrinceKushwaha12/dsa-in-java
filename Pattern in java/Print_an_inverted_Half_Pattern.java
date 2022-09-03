// Print An Inverted Half Pattern 
// *****
// ****
// ***
// **
// *

import java.util.Scanner;

public class Print_an_inverted_Half_Pattern {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user
			System.out.print("Enter Colum Number : ");
			int colum = sc.nextInt(); // input colum by user

			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= colum - i + 1; j++) {
					System.out.print("*" + " ");
				}System.out.print("\n");
			};
		};
	};
};