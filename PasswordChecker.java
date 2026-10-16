import java.util.*;

public class PasswordChecker{

	public boolean checker(String userName, String password){

		if(password.length()<8){
		
			return false;
		}else if(password.equals(userName)){

			return false;
		}else if((password.contains("!"))==false){

			return false;
		}

		return true;
	}

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your username: ");
		String userName = scanner.nextLine();
		System.out.println("Please enter your password");
		String password = scanner.nextLine();
		PasswordChecker passwordChecker = new PasswordChecker();
		boolean contains = passwordChecker.checker(userName,password);
		if(contains ==false){

			System.out.println("This password is invalid");
		}else{

			System.out.println("This passwrod is vaild");
		}
	}
}
