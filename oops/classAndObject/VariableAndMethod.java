package classAndObject;
public class VariableAndMethod {
//Access-specifier returntype methodName() {
//	
//}
	int b = 1000;  // global or class
   // normal method
	public void add() {
		int a = 10 , b = 20;
		System.out.println(a+this.b);
	}
	// parameterization 
	public void sub(int a , int b) {
		System.out.println(a-b);	
	}
//	returnType
	public int multi(int a) {
		int b = 40;   // local variable
		return a*b;
	}
	public void div() {
		System.out.println(b);
	}
	public static void main(String[] args) {
		VariableAndMethod va = new VariableAndMethod();
		va.add();
		va.add();
		va.add();
		va.add();
		va.sub(10, 5);
		va.sub(20, 2);
		va.sub(60, 90);
		
		System.out.println(va.multi(60));
		System.out.println(va.multi(40));
		System.out.println("hello".length());
		
		System.out.println(va.b);
		        
		
		

	}

}
