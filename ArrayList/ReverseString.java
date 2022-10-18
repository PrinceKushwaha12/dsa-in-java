import java.util.ArrayList;

public class ReverseString {
    
    public static void reverseString(ArrayList<String> name) {
        for(int i = name.size() - 1; i >= 0; i--) {
            System.out.print(name.get(i) + " ");
        };
    };

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("p");
        name.add("r");
        name.add("i");
        name.add("n");
        name.add("c");
        name.add("e");
        reverseString(name);
    }
}
