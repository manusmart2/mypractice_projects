package oops_concepts;

//for accessing static variable we dont need an object
//by class name we can access static variables
// for initializing static variable we use static block to execute only once 
// constructors are used to initialize the non static variables with default values 
// constructors executes every time when we create a object 
// static block executes when we load a class
// static block execuites first then after constructor executes 
//static vriables are same for all objects 
// non static variables are different for all objects 
//cannot use non static variables in static block /compiler error came


class Emp1 {
	int empid;
	int salary;
	String ceo; // class loder memory //varies for all objects
	static String company;// = "byteridge"; // fixed(same) for all objects

	static 
{
	company="bytrdg";// this will execuite only once becuase it is in static block
	//this block will not execute every time when we create a object
	// static variables only accessible inside static block/method
System.out.println("static block");

}

 public Emp1() 
 {
	empid=4;  // Executes  every time when we create a object 
	salary=450; // default values loading through constructor 
      ceo="manduri"; //for initializing non static variable we use constructor
 System.out.println("constuctor called ");
 }
 static {
	 System.out.println("staticblock fter constuctor fallows sequence ");
 }

	public void show() 
	{
		System.out.println(empid + " salary is: " + salary + " ceo is : " + ceo + " company is : " + company);
	}

}

 public class StaticDemo2 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Emp1 manu = new Emp1();
		manu.empid = 8;
		manu.salary = 233;
		manu.ceo = "mahesg"; // stores in heap memory
		// manu.company="byteridge"; // we can assign by object name or class name
		//Emp1.company = "byteridge"; // by class name we can access static variables
      
		// for accessing static variable we dont need object
		
		Emp1 raful = new Emp1();
	

		manu.show();
		
		raful.show();
		
	}

}
