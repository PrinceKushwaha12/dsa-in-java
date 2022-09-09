/* reverse string using recursion */
// time complaxity O(n);
public class ReverseString {

	public static void reverse(String name, int index) {
		//base case 
		if(index == 0) {
			System.out.print(name.charAt(index));
			return;
		};

		System.out.print(name.charAt(index));
		reverse(name, index - 1); // recursive call

	};

	public static void main(String[] args) {
		String name = "prince";
		int index = name.length() - 1; // string length
		reverse(name, index); // call function
	};
	
};
