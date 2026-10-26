package inheritance;
import java.util.Scanner;
class AmountCalc{
	public static void deposit(int amount , int balance) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("amount has been deposit \nYour current balance is "+balance);
		} else {
            System.err.println("Invalid amount has been provided.");
		}
	}
}
class ATM extends AmountCalc {
	
}
public class SingleInh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your deposit amount");
		int amount = sc.nextInt();
		ATM.deposit(amount, 1000);

	}

}
