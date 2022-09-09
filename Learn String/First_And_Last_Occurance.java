/* find string first and last Occurance in string  */
public class First_And_Last_Occurance {
	public static int first = -1; // static variables 
	public static int last = -1;
	public static void main(String[] args) {
		
		String name = "ansoansieansoa"; 
		char element = 'a'; // search element 

		for(int i = 0; i < name.length(); i++) {
			if(element == name.charAt(i)) {
				if(first == -1) {
					first = i;
				}else {
					last = i;
				};
			};
		};

		System.out.println("first index : " + first);
		System.out.println("last index : " + last);

	};
};
