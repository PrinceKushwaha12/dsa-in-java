import java.util.*;
public class even {
public static int checkEven(int num) {
    if(num % 2 == 0) {
        return 1;
    };
    return 0;
};
public static void main(String args[]) { 
    try (Scanner sc = new Scanner(System.in)) {
        int num = sc.nextInt();
        System.out.println("number is even or Not: " + checkEven(num));
    }
};
};