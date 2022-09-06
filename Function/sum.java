/* sum of two numbers */
import java.util.Scanner;

public class sum {

public static int printSum(int num1, int num2) {
    return num1 + num2;
};
public static void main(String args[]) { 
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter numuber: ");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        System.out.println("Sum: " + printSum(numberOne, numberTwo));
    };
};
};