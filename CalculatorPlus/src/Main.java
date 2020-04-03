import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int numbers;
		int attempts1 = 0;
		int attempts2 = 1;
		String oper;
		int prev_number = 0;
		int current_number = 0;	
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("What operation will you use?: M, D, A, S?");
		oper = input.nextLine();
		
		System.out.println("How many numbers do you have?");
		numbers = input.nextInt();
		
		while(attempts1 != 1) {
			System.out.println("Enter a number");
			prev_number = input.nextInt();
			attempts1++;
		}
		
		while(attempts2 < numbers) {
			System.out.println("Etner a number");
			current_number= input.nextInt();
			
			if(oper.equalsIgnoreCase("a")) {
				prev_number = prev_number + current_number;
			} 
			
			if(oper.equalsIgnoreCase("s")) {
				prev_number = prev_number - current_number;
			} 
			
			if(oper.equalsIgnoreCase("m")) {
				prev_number = prev_number * current_number;
			} 
			
			if(oper.equalsIgnoreCase("d")) {
				prev_number = prev_number / current_number;
			} 
			
			attempts2 = attempts2 + 1;
			
		}
		
		System.out.println(prev_number);
		
		
	}

}