package manuproject_test;

public class ex2 {
	
	public static void main(String[] args) {
		int m=2;
		int n=6;
		m=n++;      //n+=1;  //n=n+1; //++n;
		System.out.println("postincmval1st"+m);
		m=n;
		
		
		
		/*
		 * ++n preincrement
		 * n++ postincrement
		 */
		System.out.println(n);
		System.out.println("postincmval2nd"+m);
		m=0;
System.out.println("----------******---------");		
		m=++n;      //n+=1;  //n=n+1; //++n;
		System.out.println("preincmval1st"+m);
		m=n;
		System.out.println(n);
		System.out.println("postincmval2nd"+m);
	}

}
