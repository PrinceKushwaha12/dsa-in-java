import java.util.ArrayList;

public class SubSequanceOfArrayList {
    public static void printSubSequanceOfAString(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            for(int j = i; j < list.size(); j++) {
                // System.out.print("i is " + i);
                // System.out.print(" j is " + j);
                for(int k = i; k <= j; k++) {
                    System.out.print(list.get(k) + " ");
                };
                System.out.println();
            };
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {1, 2, 3};
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        };

        printSubSequanceOfAString(list);
    }
}
