package oops_conpt;

// the only way to create a object of interface is to implement in other class and implement the method and create a object of implemented class


interface bcd
{
	void show();
}
class Implementor implements bcd
{

	@Override
	public void show() {
		System.out.println(" anything");
	}
	
}

public class Interfaces_demo5 {

	public static void main(String[] args) {
		bcd obj= new Implementor(); //creating reference of object
		obj.show();
	}

}
