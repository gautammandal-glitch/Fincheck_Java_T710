package conditionalStatement;

import java.util.Scanner;

public class ValidateTransactions {

	public static void main(String[] args) {
		
		int balance = 45000;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your withdrawal amount : ");
		int amount = sc.nextInt();
		
		
		if (amount > 0) {
			System.out.println("valid transaction");
		}else {
			System.out.println("invalid transaction");
		}
		
		
		if (balance>amount) {
			System.out.println("Transaction successful");
		} else {
            System.out.println("Transaction failed");
		}

	}

}
