import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int num;
        num = sc.nextInt();
        outer:
            for(int i = 1; i <= num; i++) {
                if(i < num) {
                    System.out.println(i);
                }else {
                    continue outer;
                }
            };
    };
};
