package conditionalStatement;
import java.util.Scanner;
public class TransactionAndAmountValidation {
	public static void main(String[] args) {
		int balance = 100000;
		Scanner sc = new Scanner(System.in);  
		// here we store object into the variable for multiple reuse.
		System.out.println("Enter your withdrawal Amount : ");
		int withdrawal = sc.nextInt();
		if (withdrawal > 0) {
			if (balance > withdrawal) {
				System.out.println("transaction successful");
			} else {
                System.err.println("insufficient balance");
			}
		} else {
            System.err.println("Invalid transaction amount");
		}
	}
}


/*
 *   user = card number --> 16 digit --> long 
 *   User -->1111222233334444
 *   // if- else --> card number --> card not found
 *   user = pin --> 4 to 6 --> int
 *   pin --> 1234 or 123456
 *   
 *   
 *   // if - else --> pin --> incorrect pin
 */

