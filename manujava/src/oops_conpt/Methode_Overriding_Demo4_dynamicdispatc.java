package oops_conpt;
class D3
{	
	public void show()
	{
		System.out.println(" in D class show");
	}
}
class E3 extends D3
{	@Override             // to restrict the method name mismatch we use override annotation this will raise compile time error if we write wrong method names 
	public void show() // if show method is not present here  then calls the D how method
	{
	
		System.out.println(" in E class show");
	}

	public void confg()
	{
		System.out.println("config in E3 class");
	}
}
class F extends E3
{
	public void show()
	
	{
		System.out.println("in F show methode");
	}
}

public class Methode_Overriding_Demo4_dynamicdispatc {

	public static void main(String[] args) 
	{
		//E3 obj4=new E3(); // this is possible 
		D3 obj4=new E3(); //runtime polymorphism//D3 obj 4 is reference and E3 () is implementation
		//obj4.config(); // we can call only D3 class methods only we cant call E3 methods due to reference  D3
		
		
		obj4.show();   // if class E not having show method then it calls the class D show method
			// if class e1 having show method then this will override the class d1 show method
		obj4=new F();
		obj4.show();   // dynamic methode dispatch 
		
	
	}

}
