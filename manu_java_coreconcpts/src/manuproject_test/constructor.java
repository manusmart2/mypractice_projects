package manuproject_test;
class A
{
	
	int i;
	float f;
	


// constructor //even thou u dont create it will be thre 
	/*constructor is a membor method 
	 * constructor having same name of class
	 *it will not retur anything 
	 * it will be used to allocate memory
	 * it will provide initialize  default variable value
	 * it will calls automatically 
	 */
	
		public A(){
			i=6;
			f=5.0f;
			System.out.println("hi default constuctoe");
		}
		
//		it  is contructor over loading 
		public A(int k)
		{
			System.out.println("constructor overload"+k);	
		}
		
		public A(int k,float f)
		{
			System.out.println("constructor overload int "+k+"   float is: "+f);	
		}
		
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();  // calling defaulr constructor
		System.out.println(obj.i+" "+obj.f+"  ");
        A obj1=new A(6); //calling parameterized constuctor
        A obj2=new A(4,7.0f);// calling int,float constructor
	}

}
