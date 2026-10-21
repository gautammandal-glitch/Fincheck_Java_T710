package loopStatement;

public class HalfPyramidPattern {

	public static void main(String[] args) {
		/*      *
		 *      **
		 *      *** 
		 *      ****
		 *      *****
		 */
		for(int i = 1; i <= 5; i++) {  // parent loop --> row
			for(int j = 1; j <= i; j++) { // child loop  --> col (star)
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
