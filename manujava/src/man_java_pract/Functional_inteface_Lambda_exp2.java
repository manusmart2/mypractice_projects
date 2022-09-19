package man_java_pract;
// Types of interface 
//1.normal
//2.Single abstract method  or Functional interface  -- lambda Expression applicable only for functional interface ,lambda Expression derived from scala language 
//3.Marker interface   //dont have any method //eg: Serializable 


//Functional interface  - lambda Expression applicable 
//lambda Expression derived from scala language 


@FunctionalInterface
interface Abc1 
{
	void show();
	// void show1();  // not allowed to create more than one method
}


public class Functional_inteface_Lambda_exp2 {

	public static void main(String[] args)
	{
		//new Abc1() {public void  show()  we can ignore in lambda expression
		
		//Abc1 objk=new Abc1() {public void  show() 
		
		Abc1 objk=()->//this -> arrow represents method belongs to show method
			
		{
			System.out.println("Im the best ss from lamda expression");
		}
	//}
		
	;//with lambda expression
	
	//
	
	objk.show();

}
	
}
