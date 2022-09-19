package oops_conpt;

// here we cannot extend more than one class for this reason we go for interface 
//interfaces we cannot define a method we can only declare method

// interfaces having only abstract methods  it can't have normal methods
// by default in interface all methods are public abstract methods
// whenever we are working with interfaces we use implements keyword to derive properties 
// we can only create reference of object 
//we cant create a object of interface 
// we can implement multiple interfaces
//we cannt extend multiple classes 

/*importent point of interfaces
 * we cant define a method in interface
 * we cant create the object for interface
 * we can create the reference of interface
 * the only way to create a object of interface is by implements in to a separate class and override the unimplemented method and create object of implemented class
 */



interface Writer2
{
	public abstract void write(); // make it abstract and declare method
	// void write();// by default interface methods are public abstract methods

	//	public void write()  // no need to define method
//	{
//		
//	}
	
}

class Pen3 implements Writer2 //we cannot extend more than one class here 
// to achive this we go for interfaces

{
	public void write()
	{
		System.out.println("i am a pen3");
	}
}
class Pancil3 implements Writer2
{

	public void write()
	{
		System.out.println("i am a pencil3");
	}
	
}
class Kit3
{
	public void doSomething(Writer2 p)// we can give super class reference to support all subclasses
	{
		p.write();
	}
	
}

public class Interfaces_demo4

{

	public static void main(String[] args)
	{
		Kit3 k=new Kit3();
		
		Writer2 p= new Pen3();  // give reference of superclass 
		Writer2 pc= new Pancil3(); // for interface we can only create reference of object 
		//Writer2 nmm=new Writer2(); // we cannot create object of interface
		
		k.doSomething(p);   
		k.doSomething(pc);
		
		//k.doSomething(pc);// no metod available in kit class
	}

}
