package oops_conpt;

//int,char,float,double ,byte,short,long,boolean -->primitive data types

//Integer,Character,Float,Byte,Double,Long,Short,Boolean     --> Wrapper class

//when comes to speed primitive data types are faster than wrapper classes
//when we are working with certain frame works they only supports wrapper classes in that scenarios we use wrapper class

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=6;// Premitive datatype
//Integer in=new Integer(8);// Wrapper class
//Integer inn=new Integer(i);// putting primitive variable value inside  the object is called boxing-Wrapping 
//int j=in.intValue();// taking out the value from the object is called unboxing - unWrapping

Integer value=i;// AutoBoxing -Auto Wrapping
int k=value;// Autounboxing -AutounWrapping
System.out.println(k);



	}

}
