package oops_conpt;

// here we cannot extend more than one class for this reason we go for interface 

abstract class Writer1
{
	public abstract void write(); // make it abstract and declare method

	//	public void write()  // no need to define method
//	{
//		
//	}
	
}

class Pen2 extends Writer1 //we cannot extend more than one class here 
// to achive this we go for interfaces

{
	public void write()
	{
		System.out.println("i am a pen");
	}
}
class Pancil2 extends Writer1
{

	public void write()
	{
		System.out.println("i am a pencil");
	}
	
}
class Kit2
{
	public void doSomething(Writer1 p)// we can give super class reference to support all subclasses
	{
		p.write();
	}
	
}

public class Interfaces_demo3

{

	public static void main(String[] args)
	{
		Kit2 k=new Kit2();
		
		Writer1 p= new Pen2();  // give reference of superclass 
		Writer1 pc= new Pancil2();
		
		
		k.doSomething(p);   
		k.doSomething(pc);
		
		//k.doSomething(pc);// no metod available in kit class
	}

}
