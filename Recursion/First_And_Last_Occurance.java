// /* first and last occurance in string using recursion *
// time complaxity O(n);
public class First_And_Last_Occurance {
	public static int first = -1;
	public static int last = -1;

	public static void find(String name, int index, char element) {

		//base case 
		if(index == name.length()) {
			//printing first and last index of character 
			System.out.println("first index : " + first);
			System.out.println("last index : " + last);
			return;
		};

		char storeCharacter = name.charAt(index); // store first char 
		//condition statement 
		if(element == storeCharacter) {
			if(first == -1) {
				first = index;
			}else {
				last = index;
			};
		};

		find(name, index + 1, element); // recursive call
	};

	public static void main(String[] args) {
		String name = "acsdacsda";
		char element = 'a'; // search character 
		int index = 0; // store first index 
		find(name, index, element);
	};
};