package string;
import java.util.Scanner;
public class VowelAndConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String word = sc.next();
		char ch = word.toLowerCase().charAt(0);
		if (ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u') {
			System.out.println(ch+" is an vowel");
		} else {
            System.out.println(ch+" is an consonant");
		}	
	}
}