package oops_conpt;

// once we make variable as final we cant change the value of variable 
// we can assign the final variable value in constructor also 
// in class level we use final key word then the final class will not allowed to extend 

//when we use final keyword in  variable it becomes a  constant variable
//when we use final keyword in  method then no one can override the method (stops the method overriding)
//when we use final keyword in  class then no one can extent the class (stops the inheritance)


//final keyword makes class  not allowed  to extend (restrict subclass,inheritance )
//final keyword makes class  only allows to create a object of class

//final keyword makes method  not allowed to override method
// final keyword makes method allowed to over loading method


 //class G1
 final class G1
{
	public void show()
	//public final void show()  // makes final show method will not able to override anymore
	{
		System.out.println("in class G1  show method");
	}
}

//class H1 extends G1
////class H1 extends G1  // not allowed if we make G class as final class
//{
//	public void show() // overriding method
//	 // not allowed when we make final show method in class G  
//	 {
//		 System.out.println("class h show method overiding");
//	 }
//	
//	public void show(int i)// overloading is possible when we make final show method in class G 
//	  
//	 {
//		 System.out.println("class h show method over loading"+i);
//	 }
//	
//}
public class Final_Keyword_demo4 {

	public static void main(String[] args) 
	{
		G1 obj=new G1();
		obj.show();
		//obj.show(8);
		
	}

}
