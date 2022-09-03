import java.util.Scanner;
public class input {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("enter row : ");
			int row = sc.nextInt(); // input row number of 2d array 
			System.out.print("enter col : ");
			int col = sc.nextInt(); // input col of 2d array 
			
			int arr[][] = new int[row][col]; // 2d array initialize 

			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					arr[i][j] = sc.nextInt(); // array input
				};
			};

			for (int i = 0; i < row; i++) { 
				for(int j = 0; j < col; j++) {
					System.out.print(arr[i][j] + " "); // print 2d array
				}System.out.println();
			};
		};
	};
};
