package oops_conpt;


class a
{
	public a()
	{
		System.out.println("in a class constructor called ");
	}
	public a(int i) 
	{
		System.out.println(" aclass para int");
	}
}
class b extends a
{
	public b()
	{
		super(); // this will be called automatically by compiler  even we didnt mentioned here 
		//super(i);// this will call parameterized super class constructor 
		
		System.out.println("in b class constructor called ");
	}
	public b(int i)
	{
		//super(); // this will call constructor of super class ,this will called by compiler default 
		super(i);// this will call parameterized super class constructor 
		
		System.out.println("class b int params");
	}
}

public class SuperDemo
{

	public static void main(String[] args) {
		//a obj=new a(); // this will call only a class constructor
		//b obj2=new b(); // this will call a and b constructors
		b obj3=new b(5); // this will call a class constructor and b class parameterized constructor
		//b obj2=new b(); // this will call  parameerized constructor of a calss  and b  default constructors if you pass super(i) in b default constructor
		System.out.println(obj3.equals(obj3));
	}

}
