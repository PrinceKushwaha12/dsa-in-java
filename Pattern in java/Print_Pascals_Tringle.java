// Print Paskal Tringle 
//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1 

// import java.util.*;
// public class Print_Pascals_Tringle {
// public static void main(String args[]) { 
//     int size = 5;
//     for(int i = 1; i <= size; i++) {
//         for(int j = 1; j <= size - i; j++) {
//             System.out.print(" ");
//         };
//         for(int j = 1; j <= i; j++) {
//             if(j == 1 || j == i) {
//             System.out.print("1" + " ");
//             }
//             else {
//                 System.out.print(i - 1  + " ");
//             }
//         };
//         System.out.print("\n");
//     };
// };
// };

import java.util.Scanner;

public class Print_Pascals_Tringle {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Row Number : ");
			int row = sc.nextInt(); // input row by user

			int coef = 1;
			for (int i = 0; i <= row; i++) {
				for (int j = 1; j <= row - i; j++) {
					System.out.print(" ");
				}
				;
				for (int j = 0; j <= i; j++) {
					if (j == 0 || i == 0) {
						coef = 1;
					} else {
						coef = coef * (i - j + 1) / j;
					}
					System.out.print(coef + " ");
				}
				System.out.print("\n");
			};
		};
	};
};
