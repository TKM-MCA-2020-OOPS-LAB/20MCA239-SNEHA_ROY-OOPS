package product;

public class PasswordException extends Exception {
	
		int  password ;

	public PasswordException(int Password) {
		super();
		this.password = Password;
		
	}
	public String Message() {
		
		switch(password) {
		
		case 1 :
			return (" !!!! invalid password \n password length should be between 8 and 12 character \n");
			
		case 2 :
			return ("!!!!  invalid password \n password should contain at least one digit \n");
			
		case 3 :
			return("!!! invalid password \n password should contain at least one special character \n");
			
			
		}
		return null;
	

	}

}
