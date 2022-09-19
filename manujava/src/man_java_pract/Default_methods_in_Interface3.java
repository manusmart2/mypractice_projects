package man_java_pract;

//Abstract class --> we can Defines and declare methods 
//Interface --> we can only declare a methods   till jdk 1.7 
//Interface --> we can  declare  and define a methods from jdk 1.8
//from 1.8 jdk we can define methods in interface  with 'default'  special keyword 
//default method can be overridden in class

// multiple inheritance issue with interface example 

@FunctionalInterface   //even we have two methods it will not shown any error because of default method is not a abstract method 
interface Demo2 
{
	void asd();
	//public void show()// not allowed in interface
	default void show()// allowed in interface with default keyword
	{
		System.out.println("interface default method defined demo2");
	}
	
}

interface Demo3
{
	
	default void show()// allowed in interface with default keyword
	{
		System.out.println("interface default method defined demo3");
	}
}
class DemoImpl2 implements Demo2,Demo3
{

	@Override
	public void asd() {
System.out.println("in asd method implementing");		
	}
	
	// to solve ambigyity problem in interface with duplicate methods we create method in class itself 
	//or we can specify the mothode with super keyword along with interface name
	
	public void show()// default method overridden in class to solve ambiguty issue
	{
		System.out.println("interface default method defined demo3 overriden in class");
	}

	
}
public class Default_methods_in_Interface3 {

	public static void main(String[] args)
	{
		
		Demo2 obj1 =new DemoImpl2();
		obj1.asd();//method  defined inside demoimpl class 
		obj1.show(); //method defined inside interface also part of demoimpl class 
		
		
	}

}
