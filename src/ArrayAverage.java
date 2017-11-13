
public class ArrayAverage {

	public static void main(String[] args) {
		double average;
		int total = 0;
		//int count = 0;
		int[] InputArray = {2,2,5,2,7};
		
		for( int i = 0; i < InputArray.length; i++) {
			total += InputArray[i];
			
		}
		System.out.println(total);
		average = total / InputArray.length; 
		System.out.println("Your average is:" + average);
	}
}
		