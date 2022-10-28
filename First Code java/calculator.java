import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
        System.out.println("What do you choose operation ? Click number");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. %");
        System.out.println("5. /");
        int store = sc.nextInt();
        System.out.println("Enter a and b number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        switch(store) {
            case 1 : 
                System.out.println(" is : "+ num1 + num2);
                break;
            case 2 :
                System.out.println("substraction : " + (num1 - num2));
                break;
            case 3 : 
                System.out.println("multiplication : " + num1 * num2);
                break;
            case 4 :
                System.out.println("reminder : " + num1 % num2);
                break;
            case 5 : 
                System.out.println("division : " + num1 / num2);
                break;
            default :
                System.out.println("please enter currect symbol !");
                break;
        };
    };
    };
};
