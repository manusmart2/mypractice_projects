package oops_concepts;

class Calc{
int num1;
int num2;
int reslt; // instance variable 
public void perform() 
{
	reslt=num1+num2;
}
}


public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc obj=new Calc();// knows something and does something 

		obj.num1=3; // assigning the values 
		obj.num2=4;
		System.out.println(obj.reslt);// gives us 0 value 
		
		obj.perform();// calling the methods 
		
		System.out.println(obj.reslt);// gives 7 value
	}

}
