
public class ArraysCoding2 {

	public static void main(String[] args) {
		/*
		Write a program which takes an input as Integers of arrays and prints in reverse
 		order
 		EX: input : int[] a ={1,2,3,4};
 		Output:
 		a [0] = 4
 		a[1] =3
 		a[2] =2
 		a[3] = 1		 	
 		*/
		
		int[] a= {1,2,3,4};
		for (int i=3;i>=0;i--) {
			System.out.println("a["+(-i+3)+"]="+ a[i]);

} 

	}

}
