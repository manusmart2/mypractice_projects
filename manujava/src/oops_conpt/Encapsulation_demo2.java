package oops_conpt;
// Encapsulation--> Binding data with methods
// variables should be private 
// methods should be public 
// to achive encapsulation
// we can generate methods by right click and  select souce and select generate setters and getters

// need for encapsulation is to  make sure that data is safe
//whenever u change the value with the help of method we can make a log file  with changed value 

class Student1
{

	private int rollno;  // all variables should be private specifier
	private String name;
	
	// Getters and Setters
	
	public void setRollno(int r)// all methods should be public specifier
	{
		rollno=r;
		System.out.println("value of roll num changed ");
	}
	public int getRollno()
	{
		
		System.out.println("value of roll num is accessed");// logging the event
		return rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Encapsulation_demo2 {

	public static void main(String[] args) {
		Student1 s1=new Student1();
		
		// s1.rollno=2;// without methods
		//s1.name="mann";//without methods

		s1.setRollno(3); // with setter method
		System.out.println(s1.getRollno());  // get the value with getter method
		 
		s1.setName("mandy");
		System.out.println(s1.getName());
		

	}

}
