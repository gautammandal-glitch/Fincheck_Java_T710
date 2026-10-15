package conditionalStatement;

public class TransactionValidation {

	public static void main(String[] args) {
		
		
		int balance = 5000;
		int withdrawal = 40000;
		
		if (balance > withdrawal) {
			System.out.println("Transaction Successfull");
		}else {
			System.err.println("Transaction failed \ntransaction amount is greater than your balance");
		}
		
		/*  interview Question
		 *  1. palindrom
		 *  2. even and odd 
		 */
		
		

	}

}
