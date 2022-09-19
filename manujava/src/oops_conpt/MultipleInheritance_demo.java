package oops_conpt;
//java doesnt support multiple inheritance 
//due to ambiguity problem 
class v
{
	public void show() //ambiguity from where we have to call 
	{
		
	}
}
class u
{
public void show()//ambiguity from where we have to call 
{
		
	}
	
}
class w extends v // suppose w extending v,u then where we have to call show method this problem is called ambiguity 
// due to this reason java doesnt support multiple inheritance in class level
{
	
}

public class MultipleInheritance_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
