import java.util.Scanner;

public class searchElement {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter row : ");
			int row = sc.nextInt(); // input row number of 2d array
			System.out.print("enter col : ");
			int col = sc.nextInt(); // input col of 2d array

			int arr[][] = new int[row][col]; // 2d array initialize
			int i = 0;
			while (i < row) {
				int j = 0;
				while (j < col) {
					arr[i][j] = sc.nextInt();
					j++;
				};
				i++;
			};

			System.out.print("enter a target number : ");
			int target = sc.nextInt();

			System.out.println("printing array : ");
			for (int k = 0; k < row; k++) {
				for (int j = 0; j < col; j++) {
					System.out.print(arr[k][j] + " "); // print 2d array
				}System.out.println();
			};
			for (int j = 0; j < row; j++) {
				for (int k = 0; k < col; k++) {
					if (arr[j][k] == target) {
						System.out.println("index is : " + "[" + j + "," + k + "]");
					};
				};
			};

		};
	};
};
