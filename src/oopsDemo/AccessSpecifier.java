package oopsDemo;
public class AccessSpecifier {
	public long AccId = 642107673733373l;
	protected int balance = 30000;
	private int pin = 1123;
	String name = "Vignesh";
	public static void main(String[] args) {
		AccessSpecifier a = new AccessSpecifier();
		System.out.println(a.AccId);
		System.out.println(a.balance);
		System.out.println(a.pin);
		System.out.println(a.name);	
	}
}