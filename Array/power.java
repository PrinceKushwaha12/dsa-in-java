public class power {
	public static int calculaterPower(int num, int pow) {
		int ans = 1;
		//apllying for loop 
		for(int i = 0; i < pow; i++) {
			ans = ans * num;
		};
		return ans;
	}
	public static void main(String[] args) {
		int num = 2; // num is 
		int pow = 10; // num of power
		int ans = calculaterPower(num, pow);
		System.out.println("2 the power 10 is : " + ans);
	};
};
