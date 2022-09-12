/* print sub-sequance 
 * time compaxity O(2 ^ n)
*/
public class printSubsequance {
	public static void subSequance(String name, int index, String newString) {

		//base case 
		if(index == name.length()) {
			System.out.println(newString);
			return;
		};

		char currChar = name.charAt(index);
		// add the current and after call
		subSequance(name, index + 1, newString + currChar); // recursive call
		// bithout add call 
		subSequance(name, index + 1, newString); // recursive call
	}
	public static void main(String[] args) {
		String name = "abcd";
		int index = 0;
		String newString = "";
		subSequance(name, index, newString);
	}
}
