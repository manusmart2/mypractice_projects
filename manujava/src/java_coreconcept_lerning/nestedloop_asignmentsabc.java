package java_coreconcept_lerning;

public class nestedloop_asignmentsabc {
	
	/*
	 * A
	 * AB
	 * ABC
	 * ABCD
	 */

	public static void main(String[] args) {
		for(int i=1;i<=6;i++)
		{
		for(int j=1;j<=i;j++)
		{
			int k=j+64;
			char c1=(char) k;
			System.out.print(" "+c1);
		}
		System.out.println(" ");
		}
	}

}
