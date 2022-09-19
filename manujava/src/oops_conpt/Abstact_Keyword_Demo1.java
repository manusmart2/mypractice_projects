package oops_conpt;
// use of abstract class 
// here we are implemented 2 separate methods for supporting to types of data types int double 
// instead of writing two methods we can write one method which support both data types by referring super class of integer and double is number class

class Printer 
{
	public void show(Integer i)
	{
		System.out.println(i);
	}
	public void show(Double i)
	{
		System.out.println(i);
	}
}
public class Abstact_Keyword_Demo1 {

	public static void main(String[] args) {
		Printer obj=new Printer();
		obj.show(7);// passing int value this will call int show method
		obj.show(4.5); // passing double value will call double show method
		
	}

}
