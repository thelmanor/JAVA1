/**********************************************
 *          Lab #3b                                              
 *         Nora Thelma                                        
 *        January 31, 2018                                       
 **********************************************/
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		System.out.println("Enter userid:");

		String userid=input.nextLine();

		System.out.println("Enter password");

		String password=input.nextLine();

		if (userid.equals("admin")&& password.equals("ctc")){

			System.out.println("Admin User Logged In");
		}	
		else  {
			System.out.println("Admin Login Password is incorrect!”.  ");
		}
	}
}//endClass