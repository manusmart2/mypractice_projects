package oops_concepts;

// inner class having 
//member class 
//static class
//anonymous class
// inner class purpose is to serve the outer class only
// in this total 3 class files are created 
//outer.class,InnerClassDemo.class,Outer$Inner.class
// this $ symbol represents the inner class is belongs to outer class

class Outer
{
	int a;
	
	public void show()
	{
		
	}
	class Inner
	// purpose of inner class is only this is applicable to outer class only 
	{
		public void display()
		{
			System.out.println("inner class methode called in display");
		}
	}
}
public class InnerClassDemo
{
// varibles , methodes 
	
	public static void main(String[] args)
	{
		Outer obj=new Outer();
		obj.show();
		Outer.Inner obj1=obj.new Inner();// 
// outerclass.innerclassname object_ref_name=outerclass_object_name.new inner_class_constructor(); 
	obj1.display();
	
	}

}
