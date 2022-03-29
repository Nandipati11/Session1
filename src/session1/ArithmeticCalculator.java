package session1;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		char operator;
		
		int num1, num2, result;

		Scanner input = new Scanner(System.in);
		System.out.println("choose an operator: +,-,*,or /");
		operator = input.next().charAt(0);
		System.out.println("Enter first num");
		num1 = input.nextInt();

		System.out.println("Enter second num");
		num2 = input.nextInt();

		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
		case '*':
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
		case '/':
			result = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}
		input.close();
	}

}
