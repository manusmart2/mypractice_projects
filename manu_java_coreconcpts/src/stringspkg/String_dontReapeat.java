package stringspkg;

public class String_dontReapeat {
	
static int i;//,c=0,res;
    
    static void stringreverse(String s)
    {
        char ch[]=new char[s.length()];
        for(i=0;i < s.length();i++)
        ch[i]=s.charAt(i);
        for(i=s.length()-1;i>=0;i--)
        System.out.print(ch[i]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Original String is : ");
	        System.out.println(" manchester united is also known as red devil ");
	        String_dontReapeat.stringreverse(" manchester united is also known as red devil ");
	    }
		

	}


