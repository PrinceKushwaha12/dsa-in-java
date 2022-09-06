import java.util.*;

public class vote {
    public static int voteNow() {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            if (age < 18) {
                return 0;
            }
        };
        return 1;
    };

    public static void main(String args[]) {
        System.out.println("eligible of not: " + voteNow());
    };
};