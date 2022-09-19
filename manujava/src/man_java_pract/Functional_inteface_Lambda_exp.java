package man_java_pract;
// Types of interface 
//1.normal
//2.Single abstract method  or Functional interface  -- lambda Expression applicable only for functional interface ,lambda Expression derived from scala language 
//3.Marker interface   //dont have any method //eg: Serializable 


//Functional interface  - lambda Expression applicable 
//lambda Expression derived from scala language 


@FunctionalInterface
interface Abc 
{
	void show();
	// void show1();  // not allowed to create more than one method
}


public class Functional_inteface_Lambda_exp {

	public static void main(String[] args)
	{
		
		Abc objk=new Abc() {public void  show() {
			System.out.println("Im the best ss");
		}
	};//without lambda expression
	
	objk.show();

}
	
}
