package oopsDemo;
class Variable{
		
}
public class MethodAndClass {
	public static void main(String[] args) {
		Method m = new Method();
		System.out.println(m.returnType());
		System.out.println(m.returnType());
		m.normal();
		m.normal();
		m.normal();
		m.parameterized("Vignesh");
		m.parameterized("Jay");
		m.parameterized("Pritam");
		m.parameterized("Hardik");	
	}
}
class Method{
	public void normal() {
		System.out.println("This is an Normal Method");
	}
	
	public void parameterized(String name) {
		System.out.println("Name of the learner is "+name);
	}
	
	public String returnType() {
		
		return "Hello";
	}
	
}
