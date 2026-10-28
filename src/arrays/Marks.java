package arrays;
import java.util.Arrays;
public class Marks {
	public static void main(String[] args) {
		int Ajay_Hindi = 78;
		int Ajay_Marathi = 80;
		int Ajay_English = 90;
		int[] Ajay_marks = {78,80,90,67,70};
//		Ajay_marks[5] = 65;
		Arrays.sort(Ajay_marks);
		String src = Arrays.toString(Ajay_marks);
		System.out.println(Ajay_marks[4]);
		int[] arr = new int[3];   // {0,0,0}
		arr[0] = 1;     // {1,0,0}
		arr[1] = 2;     //  {1,2,0}
		arr[2] = 3;     // error {1,2,3}   <-- 3  
		int a[][] = {
				{5,10,15,20},
				{10,20,30,40},
				
		};
		System.out.println(a[0][0]);
		for(int i = 0;i <= 3; i++) {  // col --> 1
			for(int j = 0 ; j <= 1; j++) {  // row 
				System.out.println(a[j][i]);
			}
		}
		

	}

}
