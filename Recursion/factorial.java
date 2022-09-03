public class factorial {
	public static int factorialOfNumbers(int num) {
		// base case
		if (num == 1) {
			return 1;
		};

		int store = factorialOfNumbers(num - 1); // recursive call
		int ans = num * store;
		return ans;
	};

	public static void main(String[] args) {
		int num = 5;
		System.out.println(factorialOfNumbers(num));
	};
};
