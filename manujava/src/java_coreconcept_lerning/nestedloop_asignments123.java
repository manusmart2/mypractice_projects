package java_coreconcept_lerning;

public class nestedloop_asignments123 {
	
	/*
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * 123456
	 */

	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" "+j);
		}
		System.out.println(" ");
		}
	}

}
