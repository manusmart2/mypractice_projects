package com.byterid;

import java.util.ResourceBundle;

public class App {
	public int userLogin(String in_user,String in_pwd) {
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String userNmae=rb.getString("username");
		String password=rb.getString("password");
		if(in_user.equals(userNmae)&& in_pwd.equals(password))
			return 1;
		else
			return 0;
		
	}

}
