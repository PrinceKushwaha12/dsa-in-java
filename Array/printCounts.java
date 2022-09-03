
// print count numbers 
// num = 10
// ans = 1 2 3 4 5 6 7 8 9 10
import java.util.Scanner;

public class printCounts {
	public static void printCountNumbers(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print(i + " "); // print count number
		}System.out.print("\n");
	};

	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number : ");
			int number = sc.nextInt(); // input number by user
			printCountNumbers(number); // calling function
		};
	};
};