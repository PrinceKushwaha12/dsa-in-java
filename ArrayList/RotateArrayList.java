import java.util.ArrayList;
public class RotateArrayList {
    public static void rotate(ArrayList<Integer> list, int position) {
        ArrayList<Integer> temp = new ArrayList<>();
        int index = 0;
        for(int i = position; i < list.size(); i++) {
            temp.add(list.get(i));
            index++;
        };

        for(int i = 0; i < position; i++) {
            temp.add(list.get(i));
            index++;
        };
        // print rotated  array 
        printArrayList(temp);
    };

    public static void printArrayList(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        };
    };

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        // add array to array list 
        for(int i = 0; i < 8; i++) {
            list.add(i);
        };
        int position = 2;
        // call rotate arrayList 
        rotate(list, position);
    };
};
