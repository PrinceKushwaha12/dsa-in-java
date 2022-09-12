import java.util.HashSet;

/**
 * Print_Unick_Subsequnce
 */
public class Print_Unick_Subsequnce {	
	public static void subsequnce(String name, int index, String newString, HashSet<String>  allset) {
		//base case 
		if(index == name.length()) {
			if(allset.contains(newString)) { // char in contain or not 
				return;
			}else {
				allset.add(newString);
				System.out.println(newString);
				return;
			}
		}


		char currChar = name.charAt(index);
		//to add currChar 
		subsequnce(name, index + 1, newString + currChar, allset); //recursive call 

		//to not add
		subsequnce(name, index + 1, newString, allset); //recursive call
	}

	public static void main(String[] args) {
		String name = "aaa";
		HashSet<String> allset = new HashSet<>(); // implementaion of hashset
		int index = 0;
		String newString = "";
		subsequnce(name, index, newString, allset);
	}
}