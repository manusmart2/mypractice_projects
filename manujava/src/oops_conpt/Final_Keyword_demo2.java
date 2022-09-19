package oops_conpt;

// once we make variable as final we cant change the value of variable 
// we can assign the final variable value in constructor also 

class M1
{
	int i=0;
	
	final int DAY;  // final variable fixed value (constant)// variable should be capital letter its a constant value naming convention
	public M1()
	{
		DAY=8;// once we declare the value it cannot be changed forther
		// DAY=39; here we are not allowed to change anymore 
		i=10;
		// u=30; // we are not allowed to change the value of u because of final 
		
	}
}

public class Final_Keyword_demo2 {

	public static void main(String[] args) {
		M1 obj=new M1();
		System.out.println(obj.i);
		System.out.println(obj.DAY);
		
	}

}
