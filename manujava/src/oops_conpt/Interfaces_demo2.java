package oops_conpt;

//with super class we reduced code here

class Writer
{
	public void write() 
	{
		
	}
}

class Pen1 extends Writer

{
	public void write()
	{
		System.out.println("i am a pen");
	}
}
class Pancil1 extends Writer
{

	public void write()
	{
		System.out.println("i am a pencil");
	}
	
}
class Kit1
{
	public void doSomething(Writer p)// we can give super class reference to support all subclasses
	{
		p.write();
	}
	
}

public class Interfaces_demo2

{

	public static void main(String[] args)
	{
		Kit1 k=new Kit1();
		
		Writer p= new Pen1();  // give reference of superclass 
		Writer pc= new Pancil1();
		
		
		k.doSomething(p);   
		k.doSomething(pc);
		
		//k.doSomething(pc);// no metod available in kit class
	}

}
