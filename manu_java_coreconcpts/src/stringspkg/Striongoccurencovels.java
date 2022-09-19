// Java implementation to find the
// Nth occurrence of a character
package stringspkg;



class Striongoccurencovels
{

// Function to find the
// Nth occurrence of a character
static int findNthOccur(String str,
					char ch[])
{
	int occur = 0;
	
	// Loop to find the Nth
	// occurrence of the character
	for (int i = 0; i < str.length(); i++)
	{
		for(int j=0;j<ch.length;j++) {
		
		if (str.charAt(i) == ch[j])
		{
			occur += 1;
		}
		if (occur >=1 && i==str.length()-1)
			return occur;
		}
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
	String str = "AEIOUaeiou";
//	 char [] ch =new char[5];
//		 ch[0]='a';
//		 ch[1]='e';
//		 ch[2]='i';
//		 ch[3]='o';
//		 ch[4]='u';
//		 
	//int N = 1;
	
	char []ch= {'a','e','i','o','u','A','E','I','O','U'};
	
	System.out.print(findNthOccur(str, ch));
}
}

// This code is contributed by 29AjayKumar
