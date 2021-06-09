/*Write a user defined exception class to authenticate the user name and password.*/ 
package product;
import java.util.Scanner;

public class Co4_q3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String password;
		String username;
		
		System.out.print("enter a username : ");
		username = scan.next();
		
		
		try {
			usernamevalidation(username);
			System.out.println("-----------------valid username\n");
		}
		catch(UsernameException u) {
			
			System.out.println("exception occured with username ---- "+u.information());
			
		}
		
		System.out.print("enter password : ");
		password = scan.next();
		
		try {
			passwordvalidation(password);
			System.out.println(" -----------------------valid password\n");
			System.out.println("------GOOD TO GO -------");
			
			
		}
		catch (PasswordException e)
		{
			
			System.out.println("exception occured with password  ---"+e.Message());
			
		}

	}

	private static void usernamevalidation(String username) throws UsernameException {
		
		
		if (username.contains("")) {
			throw new UsernameException (1);
		}
		if(username.length()!= 6) {
			
			throw new UsernameException (2);
		}
		
	}

	private static void passwordvalidation(String password) throws PasswordException {
		
		if (!(password.length() >= 8 && (password.length() <= 12))) {
			throw  new PasswordException(1);
		}
		if (true) {
			int count = 0 ;
			
			for(int i =0 ; i<=9 ; i++) {
				String pass = Integer.toString(i);
				
				if (password.contains(pass)) {
					count = 1;
				}
			}
			if(count == 0) {
				throw new PasswordException(2);
			}
		}
		if (!(password.contains("@")|| password.contains("#") || password.contains("$")||password.contains("%")||password.contains("^")||password.contains("&")||password.contains("*"))) {
			
			throw new PasswordException(3);
		}
	}

}
