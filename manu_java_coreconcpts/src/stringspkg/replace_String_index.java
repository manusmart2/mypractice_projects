package stringspkg;

public class replace_String_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get the String
        String str = "Geeks Gor Geeks";
 
        // Get the index
        int index = 6;
 
        // Get the character
        char ch = 'F';
 
        // Print the original string
        System.out.println("Original String = " + str);
// using string class substring approach
//        str = str.substring(0, index) + ch
//              + str.substring(index + 1);
        
//        using string builder
        
        StringBuilder string = new StringBuilder(str);
        string.setCharAt(index, ch);
        
        
        // Print the modified string
        System.out.println("Modified String = " + string);
  
	}

}
