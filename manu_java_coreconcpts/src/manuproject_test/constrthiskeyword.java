package manuproject_test;
class Asd
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
	
	
		
		public  Asd(int i,float f)
		
		{
			
			this.i=i;  // this represents current object 
			this.f=f;  // this represents current object 
			System.out.println("constructor overload int "+i+"   float is: "+f);	
		}
		
}
public class constrthiskeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Asd obj=new  Asd(6,7f);  // calling defaulr constructor
	System.out.println("valie i: "+obj.i+" valuej:"+obj.f);
	}

}
