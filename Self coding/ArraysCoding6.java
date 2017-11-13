
public class ArraysCoding6 {

	public static void main(String[] args) {
		/*
		 * 6) Write a program which takes an input as doubles of arrays and it finds product
of all arrays.
EX: input : double[] a ={1.0, 2.0, 3.89, 4.78};
Output: 1.0*2.0*3.89* 4.78= 37.1884
		 */
		
		double[] a ={1.0, 2.0, 3.89, 4.78};
		double product = 1; 
		for (double elements: a) {
			product*=elements;
		}
		System.out.println(a[0]+"*"+a[1]+"*"+a[2]+"*"+a[3]+"="+product);
	}

	}

