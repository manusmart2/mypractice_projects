package man_java_pract;

//Abstract class --> we can Defines and declare methods 
//Interface --> we can only declare a methods   till jdk 1.7 
//Interface --> we can  declare  and define a methods from jdk 1.8
//from 1.8 jdk we can define methods in interface  with 'default'  special keyword 

@FunctionalInterface   //even we have two methods it will not shown any error because of default method is not a abstract method 
interface Demo1  
{
	void asd();
	//public void show()// not allowed in interface
	default void show()// allowed in interface with default keyword
	{
		System.out.println("interface default method defined");
	}
	
}

class DemoImpl1 implements Demo1
{

	@Override
	public void asd() {
System.out.println("in asd method implementing");		
	}
	
	public void show()// default method can be overridden in class
	{
		System.out.println("interface default method overrided in implementedclass");
	}
	
}
public class Default_methods_in_Interface2 {

	public static void main(String[] args)
	{
		
		Demo1 obj1 =new DemoImpl1();
		obj1.asd();//method  defined inside demoimpl class 
		obj1.show(); //method defined inside interface also part of demoimpl class 
		
		
	}

}
