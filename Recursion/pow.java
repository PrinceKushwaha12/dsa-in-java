/* calulate power */
public class pow {
	public static int power(int num, int end) {
		//base case 
		if(num == 0) {
			return 0;
		};
		if(end == 0) {
			return 1;
		};

		int ans = power(num, end - 1);  // recursive call
		return ans * num;
	};

	public static void main(String[] args) {
		int end = 5;
		int num = 2;
		int ans = power(num, end); 
		System.out.println(ans);
	}
}
