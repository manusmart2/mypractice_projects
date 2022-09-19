package java_coreconcept_lerning;

public class SelectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		/*
		 * if(n%2==0) 
		 * System.out.println("Even");
		 * for single line statement no need of cury bracess {}
		 * only need for multiple statements
		 *  if(n%2!=0) else
		 *   System.out.println("odd");
		 */

		if (n == 0)
			System.out.println("nothing");

		else if (n % 2 == 0)
			System.out.println("even");

		else
			System.out.println("odd");
	}

}
