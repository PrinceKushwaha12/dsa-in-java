/**
 * First
 */
import java.util.ArrayList;
import java.util.Collections;
public class First {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add element 
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // set element 
        list.set(0, 5);
        System.out.println(list);

        // get element 
        int num = list.get(2);
        System.out.println(num);

        // add element in any index 
        list.add(1, 3);
        System.out.println(list);

        // length of the array list 
        System.out.println(list.size());

        // delete a element in arraylist 
        list.remove(0);
        System.out.println(list);

        // iterate a array list 
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }System.out.println();

        // sort array list 
        Collections.sort(list);
        System.out.println("sorted array is " + list);
    }
}