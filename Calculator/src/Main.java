import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int firstInput;
		int secondInput;
		int finalAnswer;
		String operation;
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter your first number");
		firstInput = user_input.nextInt();
		
		System.out.println("Enter your second number");
		secondInput = user_input.nextInt();
		
		System.out.println("Add, Multiply, Divide, or Subtract? (Answer with A, M, D or S");
		operation = user_input.next();
		
		if(operation.equalsIgnoreCase("m")) {
			finalAnswer = firstInput * secondInput;
			System.out.println(finalAnswer);
		}
		
		if(operation.equalsIgnoreCase("a")) {
			finalAnswer = firstInput + secondInput;
			System.out.println(finalAnswer);
		}
		
		if(operation.equalsIgnoreCase("s")) {
			finalAnswer = firstInput - secondInput;
			System.out.println(finalAnswer);
		}
		
		if(operation.equalsIgnoreCase("d")) {
			finalAnswer = firstInput / secondInput;
			System.out.println(finalAnswer);
		}
		
	}

}
