package oops_conpt;
class D4
{	
	public void show()
	{
		System.out.println(" in D class show");
	}
}
class E4 extends D4
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
class F1 extends E4
{
	public void show()
	
	{
		System.out.println("in F show methode");
	}
}

public class Methode_Overriding_Demo4_dynamicdispatc2 {
// compile time and runtime 
	public static void main(String[] args) 
	{
		
		D4 obj4=new E4(); //runtime polymorphism//D3 obj 4 is reference and E3 () is implementation
		
		obj4.show();   // which show method has to call is decided at runtime only 
		
		obj4=new F1(); // changing the object this will change the calling methode at runtime 
		obj4.show();   // dynamic methode dispatch 
		
	
		
	// to achive dydnamic methode dispatch we have to follow runtime polymorphysm (method overriding )
	}

}
