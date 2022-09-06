// write a function to print the sum of all odd numbers from i to n.
import java.util.*;

public class oddSum {
    public static int findOddSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            };
        };
        return sum;
    };

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.println("sum of odd Number: " + findOddSum(num));
        }
    };
};