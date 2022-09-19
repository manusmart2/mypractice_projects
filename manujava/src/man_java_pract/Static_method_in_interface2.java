package man_java_pract;
//Abstract class --> we can Defines and declare methods 
//Interface --> we can only declare a methods   till jdk 1.7 
//Interface --> we can  declare  and define a methods from jdk 1.8
//from 1.8 jdk we can define methods in interface  

// we can create a static method in interface 
//if we have a static method in interface then no need to create a object of implemented class of interface 
// we can create a variable in interface but that variable becomes final and act as constant


@FunctionalInterface
interface Demo7
{
	int nnm=8;  // we can initialize variables in interface  it becomes final
	//final int nnm=8; internally final keyword will be assigned by compiler 
	// by default if we create a variable in interface then it becomes a constant 
	
	void hgf();
	static void show3() // we can define a method in interface with static keyword as well 
	{
		System.out.println("jooi");
	}
}

class Demoimple4 implements Demo7
{

	@Override
	public void hgf() {
		
		//nnm=9;//due to constant it is not allowing to modify variable 
		System.out.println("overriding hfg methode");
	}
	
}


public class Static_method_in_interface2 
{

	public static void main(String[] args)
	{
 Demo6.show3(); // due to static method we can call method with interface name //no need to create object
	}

}
