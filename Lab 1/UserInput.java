/**********************************************
 *          Lab #1c                                              
 *         Nora Thelma                                        
 *        Jan 24, 2018                                        
 **********************************************/
import java.util.Scanner;
public class UserInput{
	public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
			System.out.println("Enter salary");
			double salary= input.nextDouble();
			System.out.println("Salary is: " + salary);
	}
}// end class 