package conditionalStatement;
import java.util.Scanner;
public class AgeIndicator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		if (age>0&&age<13) {
			System.out.println("kid");
		}else if (age>12&&age<19) {
			System.out.println("Teenager");
		}else if (age>18&&age<61) {
			System.out.println("Adult");
		}else if (age>60&&age<101) {
			System.out.println("old person");
		}else {
			System.out.println("invalid age");
		}
	}
}
