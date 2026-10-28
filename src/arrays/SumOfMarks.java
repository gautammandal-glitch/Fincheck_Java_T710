package arrays;

public class SumOfMarks {
	public static void main(String[] args) {
		String name[] = {"kunal","pritam","vignesh","jay"};
		int marks[][]= {
				{76,70,60,82,71},       // kunal
				{80,70,50,99,56},       // pritam
				{45,57,90,46,55},       // vignesh
				{70,85,76,70,65}        // jay
		};
		for(int i = 0; i <= 3;i++) {  // row 1
			int sum = 0;
			for(int j = 0; j <= 4; j++) {  // col complete
				sum = sum + marks[i][j];	
			}
			System.out.println(name[i]+" total marks is "+sum+" / 500");
			System.out.println(name[i]+" percentage is "+((double)sum/5));
		}
	}
}