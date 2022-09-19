package man_java_pract;
// we are not using anonymus class in this example
class A
{
	public void show()
	{
		System.out.println("in A show");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("im the best b");
	}
}

public class Anonymus_classdemo {

	public static void main(String[] args) {
		//A obj=new A();// this will retuns the "in A show"
		A obj=new B();// this will retun the "im the best b"
		
	
		obj.show();
	}

}
