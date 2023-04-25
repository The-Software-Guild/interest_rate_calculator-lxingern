import java.util.Scanner;

public class Interest_Calculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How much do you want to invest? ");
		double initialBalance = Double.parseDouble(sc.nextLine());
		System.out.print("How many years are you investing? ");
		int years = Integer.parseInt(sc.nextLine());
		System.out.print("What is the annual interest rate % growth? ");
		double interestRate = Double.parseDouble(sc.nextLine());
			
		sc.close();
			
		double quarterlyRate = interestRate / 4;
		double interestEarned;
		double currentBalance = initialBalance;
			
		System.out.println("\nCalculating...");
		for (int i = 1; i <= years; i++) {
			System.out.println("Year " + i + ":");
			System.out.printf("Began with $%.2f\n", initialBalance);
			
			for (int j = 0; j < 4; j++) {
				currentBalance = currentBalance * (1 + (quarterlyRate / 100));
			}	
			interestEarned = currentBalance - initialBalance;
			
			System.out.printf("Earned $%.2f\n", interestEarned);
			System.out.printf("Ended with $%.2f\n\n", currentBalance);
			initialBalance = currentBalance;
		}

	}
	
}
