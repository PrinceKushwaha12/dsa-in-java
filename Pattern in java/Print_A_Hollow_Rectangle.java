// row = 4
// colom = 4
// * * * *
// *     *
// *     *
// * * * *

import java.util.Scanner;

public class Print_A_Hollow_Rectangle {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Row Number : ");
            int row = sc.nextInt(); // input row by user
            System.out.print("Enter Colum Number : ");
            int colum = sc.nextInt(); // input colum by user

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= colum; j++) {
                    if ((i == 1 || i == row) || (j == 1 || j == colum)) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print(" " + " ");
                    };
                }System.out.println();
            };
        };
    };
};