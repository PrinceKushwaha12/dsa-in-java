import java.util.ArrayList;
public class sum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // applying for loop to add array list 
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        };

        // printing sum 
        System.out.println("sum is " + sum);
    }
}
