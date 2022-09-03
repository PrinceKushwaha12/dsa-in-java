public class sumOfNumbers {
	public static void ans(int num, int sum, int lastpoint) {
		// base case
		if (num == lastpoint) {
			sum += num;
			System.out.println("sum is " + sum);
			return;
		}
		sum += num;
		ans(num + 1, sum, lastpoint); // recursive call
	};

	public static void main(String args[]) {
		ans(1, 0, 5);
	};
};