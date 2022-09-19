package man_java_pract;


//scope of the anonymous class is after A() {this block only};
// if your intention is to create a class for one time use then we create anonymous class
		
class A1
{
	public void show()
	{
		System.out.println("in A show");
	}
}
//class B1 extends A1
//{
//	public void show()
//	{
//		System.out.println("im the best b");
//	}
//}

public class Anonymus_classdemo2 {

	public static void main(String[] args) {
		//A obj=new A();// this will returns the "in A show"
		//A1 obj=new B1();// this will return the "im the best b"
		
	A1 obj =new A1()
	{
		public void show()
		{
			System.out.println("im the best b");
		}
	};// this replaces the class B1 and is called anonymous class
	//scope of the anonymous class is this block only
	// if ur intention is to create a class for one time use then we create anonymous class
		obj.show();
	}

}
