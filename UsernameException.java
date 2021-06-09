package product;

public class UsernameException extends Exception {
	
	int username;

	public UsernameException(int Username) {
		super();
		this.username= Username;
	}
	public String information() {
		
		switch (username) {
		case 1:
			return ("invalid username the username should not contain space \n");
		case 2 :
			return ("invalid username the length of the username should be 6 \n");
			
		}
		return null;
		
	}
	

}
