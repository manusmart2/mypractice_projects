package oops_concepts;

class Student{
	int rollnu;
	String name;
}

public class ArrayDemo2 {

	public static void main(String[] args) {
		Student s[]=new Student[4];
		

		
		
		for(int i=0;i<4;i++) {
			System.out.println("value of array at index "+i+" is: "+s[i]);
		}
		
	}

}
