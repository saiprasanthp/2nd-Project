package RealTimeExamples;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class LoginDemo  implements Details{
Properties pro;
InputStream in;
Scanner sc;
	@Override
	public String[] Details_Properties() throws Exception {
		in=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\JavaPractise\\src\\RealTimeExamples\\Userdata.properties");
		pro=new Properties();
		pro.load(in);
		String user=pro.getProperty("username");
		String password=pro.getProperty("password");
		String[] h=new String[10];
		h[0]=user;
		h[1]=password;
		return h;
	}

	@Override
	public void userDetails(String[] userdetails) {
		sc=new Scanner(System.in);
		System.out.println("enter username");
		String username=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		for(int i=0;i<userdetails.length;i++) {
			if(username.equals(userdetails[i])&&(password.equals(userdetails[i+1]))) {
				System.out.println("login successfull");
				this.loginDetails();
				break;
			}else {
				throw new NotValid("not valid username and password");
			}
		}
		sc.close();
		
		
	}

	@Override
	public void loginDetails() {
		System.out.println("the serivices are:log_in and checkout");
		
	}
}
