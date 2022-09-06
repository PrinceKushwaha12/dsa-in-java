/**
 * fibonacci
 */
public class fibonacci {
	public static void fib(int a, int b, int n) {
		if(n == 0) { //base case
			return;
		};

		int c = a + b;
		System.out.println(c);
		fib(b, c, n - 1); // recursive call
	};
	public static void main(String[] args) {
		int a = 0; 
		int b = 1;
		int n = 8;
		System.out.println(a);
		System.out.println(b);
		fib(a, b, n - 2);
	};
};