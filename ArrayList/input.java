import java.util.ArrayList;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arrayList size : ");
        int size = sc.nextInt();
        
        // input array list 
        System.out.println("Input ArrayList ? ");
        for(int i = 0; i < size; i++) {
            int num = sc.nextInt();
            list.add(num);
        };

        // printing array list 
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        };
    };
};
