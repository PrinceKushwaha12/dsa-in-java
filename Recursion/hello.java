/* print hello world with 10 time using recurstion */
public class hello {
	public static void print(int n) {
		// base case
		if (n == 0) {
			return;
		};
		System.out.print("hello world \n");
		print(n - 1); // recursive call
	};

	public static void main(String args[]) {
		int n = 5;
		print(n);
	};
};