package oops_conpt;

// once we make variable as final we cant change the value of variable 
// we can assign the final variable value in constructor also 
// in class level we use final key word then the final class will not allowed to extend 

//final keyword makes variable as constant variable 
//final keyword makes class  not allowed  to extend (restrict subclass)
//final keyword makes method  not allowed to override method
// final keyword makes method allowed to over loading method

 class G
 //final class G
{
	public void show()
	//public final void show()  // makes final show method will not able to override anymore
	{
		System.out.println("in class G  show method");
	}
}

class H extends G
//class H extends G  // not allowed if we make G class as final class
{
	public void show() // overriding method
	 // not allowed when we make final show method in class G  
	 {
		 System.out.println("class h show method overiding");
	 }
	
	public void show(int i)// overloading is possible when we make final show method in class G 
	  
	 {
		 System.out.println("class h show method over loading"+i);
	 }
	
}
public class Final_Keyword_demo3 {

	public static void main(String[] args) 
	{
		H obj=new H();
		obj.show();
		obj.show(8);
		
	}

}
