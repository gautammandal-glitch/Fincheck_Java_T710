package string;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Vignesh";
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		String str2 = new String("vignesh");
		if (str.equals(str2)) {
			System.out.println("Both are equal");
		} else {
            System.out.println("Both are not equal");
		}
		if (str.equalsIgnoreCase(str2)) {
			System.out.println("Both are equal");
		} else {
            System.out.println("Both are not equal");
		}
		if (str.contains("ih")) {
			System.out.println("it is contain");
		} else {
            System.out.println("it's not contain");
		}
	}
}
