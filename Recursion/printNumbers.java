/* print number 1 to 10 */
public class printNumbers {
	public static void print(int n) {
		// base case
		if (n == 11) {
			return;
		}
		;
		System.out.println(n);
		print(n + 1); // recursive call
	};

	public static void main(String args[]) {
		int n = 1;
		print(n);
	};
};