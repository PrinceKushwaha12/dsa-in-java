public class fibonacci {
	public static int printFibonacci(int n) {
		//base case 
		if(n == 1) {
			return 1;
		};

		int num = printFibonacci(n - 1);
		int num1 = num - 1;
		int num2 = num - 2;
		return num1 + num2;
	};

	public static void main(String[] args) {
		int num = 5;
		System.out.println(printFibonacci(num));
	};
};
