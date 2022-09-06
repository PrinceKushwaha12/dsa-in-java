
// write a function that takes in the radius as input and 
// and return the circumference of a circle 
import java.util.*;

public class circumference {
    public static double circumferenceFind() {
        try (Scanner sc = new Scanner(System.in)) {
            int radius = sc.nextInt();
            int result1 = 2 * radius;
            double result = 3.14 * result1;
            return result;
        }
    };

    public static void main(String args[]) {
        System.out.println("circumference of circle : " + circumferenceFind());
    };
};