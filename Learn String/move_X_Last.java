public class move_X_Last {
	
	public static void print(int count, String newString) {
		for(int i = 1; i <= count; i++) {
			newString += 'x'; // add x a new String 
		}
		System.out.println(newString); // print String 
	};

	public static void moveX(String name) {
		int count = 0; // count x 
		String newString = "";
		
		for(int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == 'x') { // 
				count++;
			}else {
				newString += name.charAt(i); // add char
			};
		};
		print(count, newString); // function call 
	};
	public static void main(String[] args) {
		String name = "sjxusxhhaxkkax";  
		moveX(name); // function call
	} 
}
