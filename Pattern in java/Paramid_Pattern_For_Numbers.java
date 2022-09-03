// Paramid Pattern For Numbers 
//     1
//    2 2
//   3 3 3 
//  4 4 4 4
// 5 5 5 5 5

import java.util.Scanner;

public class Paramid_Pattern_For_Numbers {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user
			System.out.print("Enter Colum Number : ");
			int colum = sc.nextInt(); // input colum by user

			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= colum - i; j++) {
					System.out.print(" ");
				};
				for (int j = 1; j <= i; j++) {
					System.out.print(i + " ");
				}System.out.print("\n");
			};
		};
	};
};