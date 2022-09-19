package man_java_pract;

// the only way to create a object of interface is to implement in other class and implement the method and create a object of implemented class

interface bcd {
	void show();
}

public class Anonymus_Interfaces_demo4 {

	public static void main(String[] args) {
		bcd obj = new bcd() {
			public void show() {
				System.out.println(" i a the best anything");
			}

		}; // creating reference of object 
		// if your idea is dont re use the definition the we go for Anonymous class 
		//Anonymous class uses class memory only ,advantage is this will not vest lot of memory
		
		//syntax: interfacename objname=new interfacename() {anonymous class block  which implements interface declared methods};
		
		obj.show();
	}

}
