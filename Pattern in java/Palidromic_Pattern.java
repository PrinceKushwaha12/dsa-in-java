// Palidromic Pattern 
//     1
//    212
//   32123
//  4321234
// 543212345

import java.util.Scanner;

public class Palidromic_Pattern {
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
				for (int j = i; j >= 1; j--) {
					System.out.print(j);
				};
				for (int j = 2; j <= i; j++) {
					System.out.print(j);
				}System.out.print("\n");
			};
		};
	};
};