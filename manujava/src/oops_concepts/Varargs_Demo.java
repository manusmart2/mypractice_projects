package oops_concepts;

class Calc2 {
	public int add(int i, int j)// if you pass more than two parameters then it wont work 
	{
		return i + j;
	}
}

public class Varargs_Demo 
{

	public static void main(String[] args)
	{
		Calc2 obj = new Calc2();
		System.out.println(obj.add(4, 5));// u have to pass only 2 parameters here
		
	}

}
