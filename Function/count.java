// write a program to enter numbers till the user wants and at the end
// it should display the count of positive, negative, zeros ? 
import java.util.*;

public class count {
    public static void main(String args[]) {
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        System.out.print("press 1 to continue & press 0 to stop : ");
        try (Scanner sc = new Scanner(System.in)) {
            int input = sc.nextInt();
            if (input == 1) {
                System.out.print("enter no : ");
                int number = sc.nextInt();

                if (number > 0) {
                    positive++;
                } else if (number < 0) {
                    negative++;
                } else {
                    zeros++;
                };

                System.out.print("press 1 to continue & 0 to stop");
                input = sc.nextInt();
            }
        };
        System.out.println("positive : " + positive);
        System.out.println("negative : " + negative);
        System.out.println("zeros : " + zeros);
    };
};