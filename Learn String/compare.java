/* compare to string */
// use equals proporties to compare two string 
public class compare {
	public static void main(String[] args) {
		String one = "Hello"; // first string 
		String two = "Hello"; // second string 

		if (one.equals(two)) {
			System.out.println("string is equals ?");
		} else {
			System.out.println("string is not equals ?");
		};

		// second method 
		if (one == two) {
			System.out.println("string is equals ?");
		} else {
			System.out.println("string is not equals ?");
		}
	};
};
