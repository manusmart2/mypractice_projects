package man_java_pract;


//scope of the anonymous class is after A() {this block only};
// if your intention is to create a class for one time use then we create anonymous class
		
class A2
{
	public void show()
	{
		System.out.println("in A show");
	}
}


public class Anonymus_classdemo3 {

	public static void main(String[] args) {
	
	A2 obj =new A2()
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
