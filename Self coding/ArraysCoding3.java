
public class ArraysCoding3 {

	public static void main(String[] args) {
	
/* 3) Write a program which takes an input as Integers of arrays and it finds product
of all arrays.
EX: input : int[] a ={1,2,3,4};
Output: 1*2*3*4 = 24
*/

		
		int[] a = {1,2,3,4};
		int product = 1; 
		for (int elements: a) {
			product*=elements;
		}
		System.out.println(a[0]+"*"+a[1]+"*"+a[2]+"*"+a[3]+"="+product);
	}
}