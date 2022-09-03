// Print_Hollow_Daimond_Inscribed_for_a_Rectangle
// ********* 
// **** ****
// ***   ***
// **     **
// *       *
// *       *
// **     **
// ***   ***
// **** ****
// *********

import java.util.Scanner;

public class Print_Hollow_Daimond_Inscribed_for_a_Rectangle {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user
			System.out.print("Enter Colum Number : ");
			int colum = sc.nextInt(); // input colum by user

			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= colum - i; j++) {
					System.out.print("*");
				}
				;
				for (int j = i; j >= 1; j--) {
					if (j == i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					};
				};
				for (int j = 2; j <= i; j++) {
					if (j == i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					};
				};
				for (int j = colum - i; j >= 1; j--) {
					System.out.print("*");
				}System.out.print("\n");
			};

			// reverse same
			for (int i = row; i >= 1; i--) {
				for (int j = 1; j <= colum - i; j++) {
					System.out.print("*");
				};
				for (int j = i; j >= 1; j--) {
					if (j == i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					};
				};
				for (int j = 2; j <= i; j++) {
					if (j == i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					};
				};
				for (int j = colum - i; j >= 1; j--) {
					System.out.print("*");
				}System.out.print("\n");
			};
		};
	};
};