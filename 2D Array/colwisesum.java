/* row wise sum */
public class colwisesum {
	public static void main(String[] args) {
		int arr[][] = {{5, 1}, {8, 1}}; // 2d array 

		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " "); // print simple array 
			}System.out.println();
		};

		System.out.println("row wise sum ?");
		for(int i = 0; i < 2; i++) {
			int sum = 0;
			for(int j = 0; j < 2; j++) {
				sum += arr[i][j];
			}System.out.println(sum);
		};

	};
};
