// Two number are entered by the user, x and n. write a function to find
// the value of one number raised to the power of another i.e. x power -> n ?
import java.util.*;

public class power {
    public static long findPowerOfNumber(long x, long n) {
        long result = 1;
        // apply for loop
        for (int i = 0; i < n; i++) {
            result = result * x;
        };
        return result;
    };

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            // long use t high power find in any number
            System.out.print("Enter a number : ");
            long x = sc.nextInt();
            System.out.print("power of number : ");
            long n = sc.nextInt();
            System.out.println("power of number is : " + findPowerOfNumber(x, n));
        }
    };
};