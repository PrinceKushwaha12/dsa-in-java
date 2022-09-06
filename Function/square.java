import java.util.Scanner;

public class square {

public static int findSquare(int num1, int num2) {
    return ( num1 * num2 );
};

public static void main(String args[]) { 
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter number: ");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        // call function 
        System.out.println("square is: " + findSquare(numberOne, numberTwo));
    }
};
};