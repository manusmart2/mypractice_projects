package collections;

public class Ary_cnt_ttyps {

//Java program to sort an array with two types
//of values in one traversal.public class GFG {
/* Method for segregation 0 and 1
	given input array */
	static void segregate0and1(int arr[], int n)
	{
		int type0 = 0;
		int type1 = n - 1;

		while (type0 < type1) {
			if (arr[type0] == 1) {

				// swap type0 and type1
				arr[type0] = arr[type0] + arr[type1];
				arr[type1] = arr[type0] - arr[type1];
				arr[type0] = arr[type0] - arr[type1];
				type1--;
			}
			else {
				type0++;
			}
		}
	}
	// Driver program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]
			= { 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0 };
		segregate0and1(arr, arr.length);
		for (int a : arr)
			System.out.print(a + " ");
	}
}
