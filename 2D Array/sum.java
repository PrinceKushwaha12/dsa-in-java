/* 2d array sum */
import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("enter row : ");
			int row = sc.nextInt(); //input row
			System.out.print("enter col : ");
			int col = sc.nextInt(); // input col
			
			int arr[][] = new int[row][col];
			System.out.println("enter a array -> "); //array initialize
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					arr[i][j] = sc.nextInt(); //input aray 
				};
			};

			int sum = 0;
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					sum = sum + arr[i][j]; // sum of array 
				};
			};

			System.out.println("sum is "+ sum);
		};
	};
};
