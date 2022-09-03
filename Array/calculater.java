import java.util.Scanner;

public class calculater {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter a number : ");
			int number1 = sc.nextInt(); // input number 1
			System.out.print("enter a number : ");
			int number2 = sc.nextInt(); // input number 2
			System.out.print("enter a operator : ");
			String operator = sc.next();
			switch (operator) {
				case "+":
					System.out.print("sum is : ");
					System.out.println(number1 + number2);
					break;

				case "-":
					System.out.print("substraction is : ");
					System.out.println(number1 - number2);
					break;

				case "*":
					System.out.print("multiply is : ");
					System.out.println(number1 * number2);
					break;

				case "/":
					System.out.print("devide is : ");
					System.out.println(number1 / number2);
					break;

				default:
					System.out.println("please enter valid numbers");
					break;
			};
		};
	};
};