package manuproject_test;

class calc {
	
	int num1;
	int num2;
	int result;
	
	public void operation(){
		result =num1 +num2;
	}
}

public class objandclass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj;
		obj=new calc();  //objects knows some thing object does somthing 
		obj.num1=3;
		obj.num2=4;
		obj.operation();
		System.out.println(obj.result);

	}

}
