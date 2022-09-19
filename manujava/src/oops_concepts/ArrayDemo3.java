package oops_concepts;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[] nums={8,12,34,35};

		
		//System.out.println("array value:"+nums[2]);
		//System.out.println(nums[4]);// java.lang.ArrayIndexOutOfBoundsException occures 

		for(int i=0;i<4;i++) {
			System.out.println("value of array at index "+i+" is: "+nums[i]);
		}
		
	}

}
