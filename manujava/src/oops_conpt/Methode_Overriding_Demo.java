package oops_conpt;
class D
{
	public void show()
	{
		System.out.println(" in D class show");
	}
}
class E extends D
{
//	public void show() // if show method is not present here  then calls the D how method
//	{
//		System.out.println(" in E class show");
//	}
}

public class Methode_Overriding_Demo {

	public static void main(String[] args) 
	{
		E obj4=new E();
		
		obj4.show();   // if class E not having show method then it calls the class D show method

	}

}
