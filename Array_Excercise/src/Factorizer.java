import java.util.Scanner;

public class Factorizer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What number would you like to factor? ");
		int num = sc.nextInt();
		
		sc.close();
		
		int factorCount = 0;
		int sumOfFactors = 0;
		boolean isPrime = true;
		System.out.println("The factors of " + num + " are:");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				factorCount++;
				if (i != num) {
					sumOfFactors += i;
				}
				if (i != 1 && i != num) {
					isPrime = false;
				}
			}
		}
		
		System.out.println("\n" + num + " has " + factorCount + " factors.");
		
		if (sumOfFactors == num) {
			System.out.println(num + " is a perfect number.");
		} else {
			System.out.println(num + " is not a perfect number.");
		}
		
		if (isPrime) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
	}

}
