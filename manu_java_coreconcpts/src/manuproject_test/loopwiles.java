package manuproject_test;

public class loopwiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("forloop started ");
/*
		int n = 5;

		for (int i = 0; i < n; i++) {

			System.out.println("hello5times :" + i);

		}

		System.out.println(" for loop completed ");

		System.out.println("--------*******---------");

		// while loop

		int m = 0;
		while (m < 5) {
			System.out.println("mless than 5 repeating :" + m);
			m++;
		}

		System.out.println("while completed");

		System.out.println("---------********---------");
		int o = 7;
		do {
			System.out.println("print_one time atleast :" + o);
			o++;
		} while (o < 6);

		System.out.println("do while completed");
		
		System.out.println("---------******** str prited---------");
		
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(j+" 	");
			}
			System.out.println();

		}
		*/
		System.out.println("---------********---------");
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 123456
		 * 
		 * A
		 * AB
		 * ABC
		 * 
		 * $ $ $ $
		 * $       $
		 * $       $
		 * $ $ $ $
		 */
		
		for (int i = 0; i <6; i++)
		{
			for (int j = 1; j < 6.; j++)
			{
				if(j<=i)
					System.out.print(j+"   ");
			}
			System.out.println();
			
		}
		System.out.println("---------------task1 complete--------");
		
		for (int i = 1; i <4; i++) {
			for (int j = 1; j <4; j++) {
				if(j<=i) {
			
				char n=(char) (64+j);
			
					System.out.print(n+" ");
				
				}
			}
			System.out.println();
		}
		
		System.out.println("------------test2 completed---------");
		
		for (int i =1; i <5; i++) {
			for (int j =1; j <5; j++) {
				if(j==2 && i==2)
					System.out.print("  ");
				else if (j==3 && i==3) 
				System.out.print("  ");
				else if(j==3 && i==2)
					System.out.print("  ");
				else if(i==3 && j==2)
					System.out.print("  ");
				else 
				System.out.print("$");
				
			}
			System.out.println();
		}
		
		System.out.println("------------task3 completed ----------");
		
		
		
	}

}
