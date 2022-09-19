package oops_conpt;
// we are not following interface in this code 
class Pen

{
	public void write()
	{
		System.out.println("i am a pen");
	}
}
class Pancil
{

	public void write()
	{
		System.out.println("i am a pencil");
	}
	
}
class Kit
{
	public void doSomething(Pen p)
	{
		p.write();
	}
	public void doSomething(Pancil p)
	{
		p.write();
	}
}

public class Interfaces_demo

{

	public static void main(String[] args)
	{
		Kit k=new Kit();
		
		Pen p= new Pen();
		Pancil pc= new Pancil();
		
		
		k.doSomething(p);
		k.doSomething(pc);
	}

}
