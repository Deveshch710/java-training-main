package com.coforge.Day_07_07_26_prj;

import java.io.IOException;

public class LoginSessinDemo {
	public static void validate(String uname,String pwd) {
		if(uname.equals("Ankush") && pwd.equals("Ankush123"))
		try(LoginSession session = new LoginSession()){
			session.login();
			session.accessPages();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		else {
			System.out.println("Invalid  credentials No session");
		}
	}
	public static void main(String[]args) {
		String uname="Ankush";
		String pwd="Ankush123";
		validate(uname,pwd);
		
	}

}
