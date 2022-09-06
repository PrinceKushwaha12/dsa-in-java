import java.util.Scanner;

public class table {

public static void printTable(int num) {
    for(int i = 1; i <= 10; i++) {
        System.out.println(num * i);
    };
};

public static void main(String args[]) { 
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("enter num: ");
        int num = sc.nextInt();
        printTable(num);
    }
};
};