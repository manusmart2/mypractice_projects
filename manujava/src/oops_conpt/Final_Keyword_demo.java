package oops_conpt;

// once we make variable as final we cant change the value of variable

//final keyword makes variable as constant variable 
//final keyword makes class  not allowed  to extend (restrict subclass)
//final keyword makes method  not allowed to override 


class M
{
	int i=0;
	
	final int U=9;  // final variable fixed value (constant)// variable should be capital letter its a constant value naming convention
	public M()
	{
		i=10;
		// u=30; // we are not allowed to change the value of u because of final 
		
	}
}

public class Final_Keyword_demo {

	public static void main(String[] args) {
		M obj=new M();
		System.out.println(obj.i);
		System.out.println(obj.U);
		
	}

}
