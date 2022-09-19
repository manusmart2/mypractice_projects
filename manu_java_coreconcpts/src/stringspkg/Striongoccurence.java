// Java implementation to find the
// Nth occurrence of a character
package stringspkg;



class Striongoccurence
{

// Function to find the
// Nth occurrence of a character
static int findNthOccur(String str,
					char ch, int N)
{
	int occur = 0;

	// Loop to find the Nth
	// occurrence of the character
	for (int i = 0; i < str.length(); i++)
	{
		if (str.charAt(i) == ch)
		{
			occur += 1;
		}
		if (occur == N)
			return i;
	}
	return -1;
	
//	for (int i = 0; i < str.length(); i++) {
//		
//		if(str.charAt(i)==ch) {
//			occur+=1;
//		}
//		if(occur==N) {
//			return i;
//		}
//		
//	}
//	return -2;
	
}

// Driver Code
public static void main(String[] args)
{
	String str = "manohar is good boy";
	char ch = 'h';
	int N = 1;
	System.out.print(findNthOccur(str, ch, N));
}
}

// This code is contributed by 29AjayKumar
