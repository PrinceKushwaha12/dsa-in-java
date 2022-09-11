/* remove dublicates
 * time complaxity : O(n)
 */
public class RemoveDublicates {

	public static boolean map[] = new boolean[26]; // static variable 

	public static void removeDublicates(String name, int index, String newString) {
		//base case 
		if(index == name.length()) {
			System.out.println(newString);
			return;
		};

		char currentChar = name.charAt(index); // store current character 

		if(map[currentChar - 'a'] == true) { 
			removeDublicates(name, index + 1, newString); // recursive call
		}else {
			newString += currentChar;
			map[currentChar - 'a'] = true;
			removeDublicates(name, index + 1, newString); // recursive call
		};
	}

	public static void main(String[] args) {
		String name = "pprriinnccee"; 
		int index = 0;
		String newString = "";

		removeDublicates(name, index, newString); //call fun
	}
}
