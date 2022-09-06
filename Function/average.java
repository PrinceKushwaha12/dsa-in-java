
// Enter 3 number from the user & make a function to print their average 
import java.util.*;

public class average {
    public static int findAvarage(int sum) {
        return (sum / 3);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            int sum = num1 + num2 + num3;
            System.out.println("Three numbers average is: " + findAvarage(sum));
        }
    };
};
