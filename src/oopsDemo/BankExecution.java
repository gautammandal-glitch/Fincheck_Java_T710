package oopsDemo;

public class BankExecution {

	public static void main(String[] args) {
		
		BankData b = new BankData();
		System.out.println("old account holder name "+b.getAccName());
		b.setAccName("Vignesh");
		System.out.println("new account holder name "+b.getAccName());

	}

}
