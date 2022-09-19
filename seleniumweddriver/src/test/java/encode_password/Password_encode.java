package encode_password;

import org.apache.commons.codec.binary.Base64;

public class Password_encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="test123";
  byte[] encodeString= Base64.encodeBase64(str.getBytes());
		
		System.out.println("encoded string"+new String(encodeString));
		
		byte[] decodedString=Base64.decodeBase64(encodeString);
		System.out.println("decoded string value: "+new String(decodedString));
	
	
	
	}

}
