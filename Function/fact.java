import java.util.*;
public class fact {
public static int findFact(int num) {
    int sum = 0;
    for(int i = 1; i <= num; i++) {
        sum = sum + i;
    };
    return sum;
};
public static void main(String args[]) { 
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter a number: ");
        int number = sc.nextInt();
        System.out.println("factorial is " + findFact(number));
    }
};
};