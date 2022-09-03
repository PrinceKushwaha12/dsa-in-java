// Print Floyed`s Trangle Using Numbers 
// 1
// 2 3
// 4 5 6
// 7 8 9 10

import java.util.Scanner;

public class Print_Floyeds_Trangle {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user
			int number = 1;

			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(number + " ");
					number++;
				}System.out.print("\n");
			};
		};
	};
};