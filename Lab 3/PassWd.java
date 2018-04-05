/**********************************************
 *          Lab #3a                                              
 *         Nora Thelma                                        
 *        January 31, 2018                                       
 **********************************************/
import java.util.Scanner;

public class PassWd {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		System.out.println("Enter password:");

		String password=input.nextLine();

		if (password.equals("1234")){
			System.out.println("Welcome Valued Customer");
		}	
		else  {
			System.out.println("Login incorrect");
		}
	}
}//endClass