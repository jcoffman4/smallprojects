import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		int total = 0;
		int runs = 0;
		int number;
		int avg;
		
		System.out.println("Number of numbers: ");
		counter = input.nextInt();
		
		while (runs < counter) {
			System.out.println("Enter a number: ");
			number = input.nextInt();
			total = total + number;
			runs++;
		}
		
		avg = total / counter;
		System.out.println("Your average is " + avg);
		
		
	}

}
