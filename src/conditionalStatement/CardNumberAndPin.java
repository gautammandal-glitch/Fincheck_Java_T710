package conditionalStatement;
import java.util.Scanner;
public class CardNumberAndPin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Card Number : ");
		long cn = sc.nextLong();
		if (cn==1111222233334444l) {
			System.out.println("Enter your pin : ");
			int pin = sc.nextInt();
			
			if (pin==1234) {
				System.out.println("transaction successful");
			} else {
                System.err.println("pin incorrect");
			}	
		} else {
           System.err.println("Card not found");
		}
	}
}