package oops_concepts;
// inner class purpose is to serve the outer class only
// in this total 3 class files are created 
//outer.class,InnerClassDemo.class,Outer$Inner.class
// this $ symbol represents the inner class is belongs to outer class

class Outer1
{
	static int a;
	int b;
	
	public static void show()
	{
		
	}
	static class Inner1
	// purpose of inner class is only this is applicable to outer class only 
	{
		public void display()
		{
			System.out.println("inner class methode called in display");
		}
	}
}
public class InnerClassDemo2
{
// varibles , methodes 
	
	public static void main(String[] args)
	{
		Outer1 obj=new Outer1();
		
		System.out.println(Outer1.a);
		System.out.println(obj.b);
		Outer1.show();
		Outer1.Inner1 obj1=new Outer1.Inner1();// 
// outerclass.innerclassname object_ref_name=new outerclass_mane.inner_class_constructor(); 
	obj1.display();
	
	}

}
