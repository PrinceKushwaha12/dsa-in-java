import java.util.Scanner;

public class printName {
    public static void namePrint(String name) {
        System.out.println("name : " + name);
    };

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            namePrint(name);
        }
    };
};