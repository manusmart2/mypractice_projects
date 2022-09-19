package oops_concepts;

class Calc3 
{
	//public int add(int i, int j)// if you pass more than two parameters then it wont work 
	
	public int add(int ...n) // as array they will come {4,5,6,7,8}
	//int ...n is variable length arguments 
	{
		int sum=0;
		for(int i:n) {
			sum=sum+i;
		}
		
		return sum;
	}
}

public class Varargs_Demo2 
{

	public static void main(String[] args)
	{
		Calc3 obj = new Calc3();
		System.out.println(obj.add(4, 5,5,3,1));// now we can pass any no of parameters
		
	}

}
