import java.util.ArrayList;
public class AddTwoArrayList {
    public static int addToArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum = 0;
        // calculate first array list sum 
        for(int i = 0; i < list1.size(); i++) {
            sum = sum + list1.get(i);
        };

        // calculate second array list sum 
        for(int i = 0; i < list2.size(); i++) {
            sum = sum + list2.get(i);
        };

        return sum;
    };

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        // add first array value to arrayList 
        int arr1[] = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr1.length; i++) {
            list1.add(arr1[i]);
        };

        // add second array value to arrayList 
        int arr2[] = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr2.length; i++) {
            list2.add(arr2[i]);
        };

        // print the hole answer 
        System.out.println("Sum of two Array is " + addToArrayList(list1, list2));
    };
};
