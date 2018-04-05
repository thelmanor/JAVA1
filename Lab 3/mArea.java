/**********************************************
 *          Lab #3d                                              
 *         Nora Thelma                                        
 *        January 31, 2018                                       
 **********************************************/
import java.util.Scanner;

public class mArea {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		System.out.println("Area Program: Enter C for Circle, S for Square, R for Rectangle");
		
		String userInput=input.nextLine();
		
		switch(userInput){

		case"C":
			System.out.println("Enter the radius of the circle:");
			
			double radius=input.nextDouble();
			
			System.out.println("Area of the circle is =" + " " +3.14 * radius * radius);
			
			break;

		case"S":
			System.out.println("Enter the length of the square sides:");
			
			double sLength=input.nextDouble();
			
			System.out.println("Area of the square is= " + " "+ sLength * sLength);
			
			break;


		case"R":
			System.out.println("Enter the side length of the rectangle:");
			
			double Length=input.nextDouble();

			System.out.println("Enter the side height of the rectangle:");

			double Height=input.nextDouble();

			System.out.println("Area of the rectangle is=" + " "+ Length * Height);
			
			break;
			
		
}
		
	}
}//endClass