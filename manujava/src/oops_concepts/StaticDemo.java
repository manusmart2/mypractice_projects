package oops_concepts;

//for accessing static variable we dont need object
//by class name we can access static variables

class Emp {
	int empid;
	int salary;
	String ceo; // class loder memory //varies for all objects
	static String company;// = "byteridge"; // fixed(same) for all objects

	public void show() 
	{
		System.out.println(empid + " salary is: " + salary + " ceo is : " + ceo + " company is : " + company);
	}

}

public class StaticDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Emp manu = new Emp();
		manu.empid = 8;
		manu.salary = 233;
		manu.ceo = "mahesg"; // stores in heap memory
		// manu.company="byteridge"; // we can assign by object name or class name
		Emp.company = "byteridge"; // by class name we can access static variables
      
		// for accessing static variable we dont need an object
		
		Emp raful = new Emp();
		raful.empid = 5;
		raful.salary = 722;// stores in heap memory
		raful.ceo = "rakesh";

		manu.show();
		
		raful.show();
		
	}

}
