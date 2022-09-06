import java.util.*;
public class prime {
public static int checkPrime(int num) {
    if(num % 2 == 0){
        return 0;
    };
    return 1;
};
public static void main(String args[]) { 
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter num: ");
        int number = sc.nextInt();
        System.out.println("number is " + checkPrime(number));
    }
};
};