package java_coreconcept_lerning;

public class NestedLoops {

	/*
	 * 
	 * * * * * * * * * * * * *
	 * 
	 */

	public static void main(String[] args) {

		nestedloop_with_for();
		System.out.println("for ended :");
		nestedloopstar_with_while();
		System.out.println("while ended ");
		nested_do_while();
		System.out.println(" do while ended ");

	}

	
	 public static  void  nestedloop_with_for() {
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}
	
	public static void nestedloopstar_with_while() {
		int j=1;
		while(j<=4)
		{
	int i=1;
		while(i<=4) {
			System.out.print(" * ");
			i++;
			
		}
		System.out.println(" ");
		j++;
		
		}
	}
	

	public static void nested_do_while() {
		
		int i=1;
		
		do {
			int j=1;
		do {
			System.out.print(" * ");
			j++;
		}while(j<=4);
		
		System.out.println(" ");
		i++;
		}while(i<=4);
		
		
	}
	
	
	}

