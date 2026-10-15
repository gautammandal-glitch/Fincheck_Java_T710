package userInput;

import java.util.Scanner;

public class TakeValueFromUser {

	public static void main(String[] args) {
		
		
//		datatype var = value (object)
		Scanner sc =  new Scanner(System.in);      // object
		System.out.println("Enter your withdrawal amount");
		int amount = sc.nextInt();
		
		
		System.out.println("user withdrawal amount is "+amount);
		

	}

}
