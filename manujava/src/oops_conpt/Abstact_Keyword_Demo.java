package oops_conpt;

// we cannot create a object of abstract class / we cannot instantiate abstract class
// we can define method or declare a method
// if you declare a method with abstract key word is called abstract method
// incomplete method ,method doesnt contains a body in abstract methods
//if your class having abstract method then that class must be declare as abstract class  
// abstract class can have abstract method  or normal method
// when you are extending abstract class  then we need to implement abstract methods
// Human class is called abstract class 
// Man class is called Concrete class
abstract class Human
{
	public void eat()// defining a method 
	{
		
	}
	
	public abstract void swim();//  declare a method /abstract method
	
	
	public void walk()
	{
		
	}
	
}

class Man extends Human //extending abstract class 
{

	@Override  
	public void swim() // implementing the  abstract method of  abstract class
	{
		System.out.println(" calling swimm method");
	}
	
}


public class Abstact_Keyword_Demo {

	public static void main(String[] args)
	{
		//Human obj = new Human(); we cannot create object of abstract class
		//if you want to create a object of abstract class then we have to extend to other class and implement the abstract method then we can able to create a object of abstract class
		
		Human obj=new Man(); // creating the object reference of abstract class
		
							// Human class is called abstract class 
							// Man class is called Concrete class
		obj.swim(); // calling swim method
		
		

	}

}
