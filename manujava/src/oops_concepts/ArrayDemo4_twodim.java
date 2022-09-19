package oops_concepts;

public class ArrayDemo4_twodim {

	public static void main(String[] args) {
//		int[] a={8,12,34,35};
//		int b[]= {3,2,4,1};  
//		int[]c= {87,45,24,22};
		//this can be represented as fallows 
		
		int d[] []= {
				{1,2,3,4},
				{4,5,8,6},{3,5,4,3} 
		};  // two dimentional array
		// all arrays are same dimention

		

		for(int i=0;i<3;i++) // --> row count 
		{
			for(int j=0;j<4;j++)//--> colum count
			{
				System.out.print("  "+d[i][j]);
				
			}
			System.out.println();
		}
		
	}

}
