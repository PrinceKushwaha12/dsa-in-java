/**
 * MoveXInLastPosition
 * time complaxity O(n);
 */
public class MoveXInLastPosition {
	/* print function */
	public static void print(String newString) {
		System.out.println(newString);
	};
	
	/* create function */
	public static void moveXInLast(String name, int index, int count, String newString) {
		//base case 
		if(index == name.length()) {
			// add x in last position
			for(int i = 1; i <= count; i++) {
				newString = newString + 'x';
			};
			//print new String 
			print(newString);
			return;
		}

		//check the first string character is equals to x or not 
		if(name.charAt(index) == 'x') {
			count++; //increase counts
			moveXInLast(name, index + 1, count, newString); // recursive call function
		}else {
			newString = newString + name.charAt(index);
			moveXInLast(name, index + 1, count, newString); // recursive call function
		}
	}

	public static void main(String[] args) {
		String name = "sjxusxhhaxkkax"; // some rendom string 
		int index = 0; // index of string 
		int count = 0; // count x in string 
		String newString = ""; // empty string store new String 
		//call function 
		moveXInLast(name, index, count, newString);
	}
}