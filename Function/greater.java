// write a function that takes in 2 numbers and returns
// the greater of those two 
import java.util.*;
public class greater {
public static int findGreater() {
    try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b) {
            return a;
        };
        return b;
    }
};
public static void main(String args[]) { 
    System.out.println( "greater : " + findGreater());
};
};
