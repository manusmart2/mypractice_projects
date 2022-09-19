package oops_concepts;

class Casio {

	public void add(int i, int j)  // methode over loading with 2  int prameters
	{
		System.out.println(i + j);
	}
	
	public void add(int i,int j,int k) // methode over loading with 3 int parameters
	{
		System.out.println(i+j+k);
	}
	public void add(double b,double c)// methode overloading with 2 double parameters
	{
		System.out.println(b+c);
	}
}

public class Methode_Overloading {

	public static void main(String[] args) {
		Casio obj = new Casio();
		obj.add(3, 9);
		obj.add(2, 5, 3);
		obj.add(3.3, 4.4);

	}

}
