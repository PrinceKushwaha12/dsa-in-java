/**
 * PrintKeyPadCombination
 */
public class PrintKeyPadCombination {
	// all keypadd combinations 
	public static String map[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};

	public static void keyPadCombination(String key, int index, String combination){
		//base case 
		if(index == key.length()) {
			//print and return 
			System.out.println(combination);
			return;
		}

		char currChar = key.charAt(index); // store currChar
		String storekey = map[currChar - '0']; // find keypad character in array 
		for(int i = 0; i < storekey.length(); i++) { // run loop 
			keyPadCombination(key, index + 1, combination + storekey.charAt(i)); // recursive call 
		};
	}
	public static void main(String[] args) {
		String key = "123";
		int index = 0;
		String combination = "";
		keyPadCombination(key, index, combination); // function call 
	}
}
