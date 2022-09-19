package oops_concepts;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] nums=new int[4];
		nums[0]=8;
		nums[1]=2;
		nums[2]=65;
		nums[3]=88;
		
		nums[2]=99;  // latest value only gives
		
		
		
		//System.out.println("array value:"+nums[2]);
		//System.out.println(nums[4]);// java.lang.ArrayIndexOutOfBoundsException occures 

		for(int i=0;i<4;i++) {
			System.out.println("value of array at index "+i+" is: "+nums[i]);
		}
		
	}

}
