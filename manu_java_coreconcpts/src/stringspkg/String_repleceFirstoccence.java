package stringspkg;

public class String_repleceFirstoccence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The Haunting of Hill House!";
	       System.out.println("String: "+str);
//	       String res = str.replaceFirst("(?:H)+", "B");
	       String res = str.replaceAll("(?:H)+", "M");
	       System.out.println("String after replacing a character's first occurrence: "+res);
	}

}
