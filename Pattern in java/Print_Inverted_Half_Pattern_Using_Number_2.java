// Print Inverted Half Patten Using Number -2
// 1 1 1 1 1
// 2 2 2 2 
// 3 3 3
// 4 4 
// 5 

import java.util.Scanner;

public class Print_Inverted_Half_Pattern_Using_Number_2 {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user
			System.out.print("Enter colum Number : ");
			int colum = sc.nextInt(); // input colum by user

			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= colum - i + 1; j++) {
					System.out.print(i + " ");
				}
				System.out.print("\n");
			};
		};
	};
};