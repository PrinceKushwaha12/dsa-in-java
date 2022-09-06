/* 2^n */
public class powlogn {
	public static int calculater_power(int num, int pow) {
		//base case 
		if(num == 0) {
			return 0;
		}

		if(pow == 0) {
			return 1;
		};

		if(pow % 2 == 0) {
			return calculater_power(num, pow/2) * calculater_power(num, pow / 2);
		}else {
			return calculater_power(num, pow / 2) * calculater_power(num, pow / 2) * 2;
		}
	};
	public static void main(String[] args) {
		int pow = 5;
		int number = 2;
		int ans = calculater_power(number, pow);
		System.out.println(ans);
	};
};
