// import something.first;
import java.util.LinkedList;

public class collection {
    public static void main(String args[]) {
        LinkedList<Integer> num = new LinkedList<Integer>();
        num.addFirst(1);
        num.addFirst(0 );
        num.addFirst(-1);
        num.add(0, -2);
        num.addLast(2);
        num.addLast(3);
        num.addLast(4);
        num.remove();
        num.remove();
        num.removeLast();
        num.removeFirst();
        System.out.println("Size is -> " + num.size());
        System.out.println(num);

    };
};