//doubt
/* 
 * permutation of string 
 */
public class PermutationOfString {

    public static void findPermutation(String name, int index, String permutation) {
        // base case
        if (name.length() == 0) {
            System.out.println(permutation); // print permutation of string 
            return;
        }

        for (int i = 0; i < name.length(); i++) {
            char currChar = name.charAt(i); // store currectCharacter index 
            String newString = name.substring(0, i) + name.substring(i + 1); // find the others characters
            findPermutation(newString, index + 1, permutation + currChar); // recursive call
        }
    }

    public static void main(String[] args) {
        String name = "abc"; // simple string
        findPermutation(name, 0, ""); // function call
    }
}