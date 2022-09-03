// Print Half Pattern Using Starts Like This :
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 

import java.util.Scanner;

public class Print_Half_Pattern {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user

			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*" + " ");
				}System.out.print("\n");
			};
		};
	};
};