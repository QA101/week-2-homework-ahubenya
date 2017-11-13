
public class ArraysCoding5 {

	public static void main(String[] args) {
		/*5) Write a program which takes an input as doubles of arrays and prints in reverse
order
EX: input: double[] a ={1.2, -20, 3.89, 400.0};
Output:
a [0] = 400.0
a[1] =3.89
a[2] = -20
a[3] = 1.2
*/
		double[] a ={1.2, -20, 3.89, 400.0};
		for (int i=3;i>=0;i--) {
			System.out.println("a["+(-i+3)+"]="+ a[i]);
		}
		
		
	}

}
