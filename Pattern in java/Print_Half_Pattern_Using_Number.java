// Print Half Pattern Using Number 
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 

import java.util.Scanner;

public class Print_Half_Pattern_Using_Number {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user

			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.print("\n");
			};
		};
	};
};