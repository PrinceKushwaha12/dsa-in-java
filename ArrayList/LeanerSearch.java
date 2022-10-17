import java.util.ArrayList;
import java.util.Scanner;

public class LeanerSearch {
    public static int searchElement(ArrayList<Integer> list, int target) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == target) {
                return i;
            };
        }
        return -1;
    };


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        // add array element to array list 
        for(int i = 0; i < 8; i++) {
            list.add(arr[i]);
        };
        
        // target input by user 
        int target = sc.nextInt();
        System.out.println("Index is " + searchElement(list, target));
    };
};
