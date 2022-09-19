package oops_concepts;
/*constructor is a member method 
 * same name as class name  (bullet 1)
 * constructor will not return anything  (bullet 2)
 * constructor  will be used to allocate memory
 * constructor used to initialize the variable values
 * constructor will be called automatically when we create a object (bullet 3)
 * you canot call the constructor for the same instance 
 * if u have multiple constructors with different parameters is called constructor overloading 
 */

class A{
	int d; // declaring instance  variable 
	int f;
	
	public A() // dont have return type 
	{
		 d=3; // initializing variable values from constructor
		f=8;
		System.out.println(" hi default constructor");
	}
	
	public  A(int h) // constructor overloading 
	{
		d=9;
		f=54;
		System.out.println(" hi parameterise constructor"+h);
	}
	
	public A(double k,int v)
	{
		d=(int)k;  
		//f=v; // f is instance variable and v is local variable
		this.f=v+1; // this key word represents current object or instance of object
		// when we have same variable names in instance and local then we can differentiating them with this keyword
		//like example:  this.f=f;
		
		System.out.println(" casted value of kis :"+d);
	System.out.println(" value of int v: "+f);
	}
}

public class Constructor_demo {

	public static void main(String[] args) 
	{
		
     A obj1=new A();// default constructor if we dont mention this will create automatically by java compiler
     System.out.println(obj1.d);
     System.out.println(obj1.f);
     
     A obj2=new A(3);// Parameterized
     
     System.out.println(obj2.d);
     System.out.println(obj2.f);
     
     A obj3=new A(4.9,7);
     System.out.println(obj3.f);
     
	}

}
