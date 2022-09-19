package oops_conpt;

//inheritance having 2  relationship  they are IS-A  , HAS -A 
// IS-A  --> when ever a class extends from other class is a called IS -A relationship
//HAS -A  --> in a class creating object of another class is called HAS-A relationship

class Calc5 //super ,parent ,Base class
{
	public int add(int i, int j)
	{
		return i + j;
	}
}
class CalcAdv extends Calc5   // sub,child ,derived  class inherited from super class
{
//	public int add(int i,int k) {
//		return i+k;
//	} // instead of writing code we can fetch the feature from other class
	public int  sub(int i,int k) {
		return i-k;   
	}
}

class CalcVeryAdv extends CalcAdv // multi level inheritance  //IS-A relationship
{
	public int multi(int i,int j) 
	{
		return i*j;
	}
}

public class Inheritance_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc5 obj = new Calc5();//HAS-A relation ship
		int resulr = obj.add(6, 8);
		System.out.println(resulr);
		
		System.out.println("  *******single level inheritence started *****");
		
		CalcAdv obj1=new CalcAdv();//HAS-A relation ship
		int result1=obj1.add(3, 6);
		int result2=obj1.sub(6, 3);
		
		System.out.println(result1);
		System.out.println(result2);

		System.out.println("  *******multi level inheritence started *****");
		CalcVeryAdv obj2=new CalcVeryAdv();//HAS-A relation ship
		
		int res1=obj2.add(2, 4);
		int res2=obj2.sub(6, 3);
		int res3=obj2.multi(4, 2);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
		
		
	}

}
