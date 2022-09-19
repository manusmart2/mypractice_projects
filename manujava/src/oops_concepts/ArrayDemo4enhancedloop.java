package oops_concepts;

public class ArrayDemo4enhancedloop {

	public static void main(String[] args) {
		int[] nums={8,12,34,35};


//		for(int i=0;i<4;i++) {
//			System.out.println("value of array at index "+i+" is: "+nums[i]);
//		}
//		
		for(int k:nums) {
			System.out.println("value of array "+k);
		}
	}

}
