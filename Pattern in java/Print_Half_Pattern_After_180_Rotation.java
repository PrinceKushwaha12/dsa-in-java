// Print Half Pattern After 180
//     *
//    **
//   ***
//  ****
// *****

import java.util.Scanner;

public class Print_Half_Pattern_After_180_Rotation {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user
			System.out.print("Enter Colum Number : ");
			int colum = sc.nextInt(); // input colum by user

			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= colum; j++) {
					if (j <= row - i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					};
				}System.out.print("\n");
			};
		};
	};
};