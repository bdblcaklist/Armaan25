package basic;

public class PracticeArray {

	public static void main(String[] args) {
		
		//In Java, an array is a data structure used to store a collection of elements of the same type
		//Limitations 
		
		// fix in size 
		// at the runtime you cannot change the value or size 
		//Array must be same data type 
		//array is use in index concepts 
		

		int a [] = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;


		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
			
			if(a [i] == 400 || a[i] == 100) {
				System.out.println(a[i]);
				continue;
			}
		}
		
		System.out.println(a.length);
		
	}

}
