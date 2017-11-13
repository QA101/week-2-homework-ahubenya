
public class ArraysCoding7 {

	public static void main(String[] args) {
		/* 7) Write a program which takes an input as doubles of arrays and it finds average
of all arrays.
*/
		double average;
		double total = 0;
		
		double[] InputArray = {1.1,2.2,3.5,10.5,5.7};
		
		for( double i = 0; i < InputArray.length; i++) {
			total += InputArray[(int) i];
			
		}
		System.out.println(total);
		average = total / InputArray.length; 
		System.out.println("Your average is:" + average);
	}
}
		

