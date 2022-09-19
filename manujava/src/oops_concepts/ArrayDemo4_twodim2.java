package oops_concepts;

public class ArrayDemo4_twodim2 {

	public static void main(String[] args) {

		int d[] []= {
				{1,2,3,4,7,4,3},
				{4,5,8,6},{3,5,4,4,5,3} 
		};  // two dimentional array all rays are not same dimention then we call it as  
// jagged arrays 
		

		for(int i=0;i<d.length;i++) // --> row count 
		{
			for(int j=0;j<d[i].length;j++)//--> colum count
			{
				System.out.print("  "+d[i][j]);
				
			}
			System.out.println();
		}
		
	}

}
