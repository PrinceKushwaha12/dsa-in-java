/* reverse a string */
public class reverse {
	public static void main(String[] args) {

		String name = "prince"; // string 
		int length = name.length(); // string length
		for(int i = length - 1; i >= 0; i--) { // last to first index iterates
			System.out.print(name.charAt(i)); // print last to first 
		}

	};
};
