package oops_conpt;
class D1
{	
	public void show()
	{
		System.out.println(" in D class show");
	}
}
class E1 extends D1
{	@Override             // to restrict the method name mismatch we use override annotation this will raise compile time error if we write wrong method names 
	public void show() // if show method is not present here  then calls the D how method
	{
	
		System.out.println(" in E class show");
	}
}

public class Methode_Overriding_Demo2 {

	public static void main(String[] args) 
	{
		E1 obj4=new E1();
		
		obj4.show();   // if class E not having show method then it calls the class D show method
			// if class e1 having show method then this will override the class d1 show method
	}

}
