/* row wise sum */
public class rowwisesum {
	public static void main(String[] args) {
		int arr[][] = {{2,3},{4,5}}; // array initialize
		
		System.err.println("print array ?");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.err.print(arr[i][j] + " "); // array print
			}System.err.println();
		};

		System.err.println("row wise sum ?");
		for(int i = 0; i < 2; i++) {
			int sum = 0;
			for(int j = 0; j < 2; j++) {
				sum += arr[j][i];  // find sum
			}System.err.print(sum + " ");;
		};
	};
};
