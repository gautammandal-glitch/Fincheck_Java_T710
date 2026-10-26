package inheritance;
class Balance{
	public int getbalance(int balance) {
		return balance;
	}
}
class CheckBalance extends Balance{
	public void validate(int balance[] , String name[] , String accid[]) {
		for(int i = 0; i < name.length;i++) {
			if (name[i].equals("Jay")&&accid[i].equals("102")) {
				System.out.println(getbalance(balance[i]));
				return;
			} 
		}
		System.err.println("No account has been found");	
	}	
}
class Atm extends CheckBalance{	
}
class finCheckApp extends CheckBalance{
	
}
public class MultiLevelInh {
	public static void main(String[] args) {
		String AccId[] = {"101","102","103"};
		String name[] = {"Vignesh","Hardik","Pritam"};
		int[]  balance = {30000,18000,150};
//		Atm a = new Atm();
//		a.validate(balance, name, AccId);
		
		finCheckApp app = new finCheckApp();
		app.validate(balance, name, AccId);
	}
}
