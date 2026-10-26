package loopStatement;
import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int atm = 1000;   // atm cash reserve
		int withdrawal = 0;  // atm withdrawal
		int deposit;   // atm deposit
		while(atm>0 && atm > withdrawal) {
		System.out.println("Enter your card number : ");
		long cn = sc.nextLong();
		if (cn==1111222233334444l) {
			for(int i = 1; i <=3;i++) {
			System.out.println("Enter your pin : ");
			int pin = sc.nextInt();
			if (pin==1234) {
				int balance = 100000000;
		System.out.println("Menus \n1.deposit\n2.withdrawal\n3.check balance\n4.exit");
				int menu = sc.nextInt();
//				"1" --> 1
				switch (menu) {
				case 1:
					System.out.println("Enter your deposit amount");
					int amount = sc.nextInt();
					deposit = amount;    //   amount --> deposit
					if (amount > 0) {
						balance = balance + amount;
						atm = atm + deposit;    //  atm calculation
						System.out.println("Your current update balance is "+balance);
					} else {
                         System.out.println("invalid deposit amount");
					}
					break;
				case 2:
					System.out.println("Enter your withdrawal amount : ");
					 amount = sc.nextInt();
					 withdrawal = amount;   // amount --> withdrawal
					 if (amount > 0) {
						balance = balance - amount;
						atm = atm - withdrawal;   // atm calculation
						System.out.println("Your current update balance is "+balance);
					} else {
						System.out.println("invalid withdraw amount");
					}
					break;
				default:
					System.out.println("invalid menus option has been typed");
					break;
				}
				break;
			} else {
               System.err.println("Incorrect pin");
			}
			}
		} else {
			System.out.println("your card not found");
		}
		}
	}

	}


