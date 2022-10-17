import java.util.ArrayList;

public class ReverseArrayList {
    public static void reverseArrayList(ArrayList<Integer> list) {
        // reverse order print ArrayList 
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        };
    };
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for(int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        };

        reverseArrayList(list);
    }
}
