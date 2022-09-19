package oops_conpt;
// use of abstract class 
// here we are implemented 2 separate methods for supporting to types of data types int double 
// instead of writing two methods we can write one method which support both data types by referring super class of integer and double is number class

class Printer1 
{
	public void show(Number i)// one method supports all sub classes(integer,double,float) of number class 
	{
		System.out.println(i);
	}
	
}
public class Abstact_Keyword_Demo2 {

	public static void main(String[] args) {
		Printer1 obj=new Printer1();
		obj.show(3);// passing int value this will call int show method
		obj.show(5.5); // passing double value will call double show method
		obj.show(6.3f);
	}

}
