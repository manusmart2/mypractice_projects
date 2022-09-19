package java_coreconcept_lerning;

public class loops_break_continue {

	public static void main(String[] args) {

		for(int i=0;i<=10;i++) {
			
			if(i>5) {
				break;// break the loop (out from loop after 5  )
			}
			System.out.println(" value is i : "+i);
		}
		System.out.println(" continue staement started ");
		
		for(int j=0;j<=10;j++) {
			
			if(j==8) {
				continue;//skip the loop(skip the value 8)
			}
			System.out.println(" value is j : "+j);
		}
		
	}

}
