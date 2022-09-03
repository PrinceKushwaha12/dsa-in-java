// Row = 4
// Colom = 4
// * * * * 
// * * * *
// * * * * 
// * * * * 

import java.util.Scanner;

public class Print_Solid_Rectangle {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user
			System.out.print("Enter Colum Number : ");
			int colum = sc.nextInt(); // input colum by user

			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= colum; j++) {
					System.out.print("*" + " "); // print start
				}
				System.out.print("\n"); // print next line always
			};
		};
	};
};