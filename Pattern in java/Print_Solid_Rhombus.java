// Print Solid Rhambus
//     ****
//    ****
//   ****
//  ****
// ****

import java.util.Scanner;
public class Print_Solid_Rhombus {
	public static void main(String args[]) { 
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user
			System.out.print("Enter Colum Number : ");
			int colum = sc.nextInt(); // input colum by user

			for(int i = 1; i <= row; i++) {
				for(int j = 1; j <= colum - i; j++) {
					System.out.print(" " + " ");
				};
				for(int j = 1; j <= colum; j++) {
					System.out.print("*" + " ");
				}System.out.print("\n");
			};
		};
	};
};