package man_java_pract;

//Abstract class --> we can Defines and declare methods 
//Interface --> we can only declare a methods   till jdk 1.7 
//Interface --> we can  declare  and define a methods from jdk 1.8
//from 1.8 jdk we can define methods in interface  with 'default'  special keyword 


interface Demo
{
	void asd();
	//public void show()// not allowed in interface
	default void show()// allowed in interface with default keyword
	{
		System.out.println("interface default method defined");
	}
	
}

class DemoImpl implements Demo
{

	@Override
	public void asd() {
System.out.println("in asd method implementing");		
	}
	
}
public class Default_methods_in_Interface {

	public static void main(String[] args)
	{
		
		Demo obj =new DemoImpl();
		obj.asd();//methode  defined inside demoimpl class 
		obj.show(); //methode defined inside interface also part of demoimpl class 
		
		
	}

}
