/**********************************************
 *          Lab #3c                                              
 *         Nora Thelma                                        
 *        January 31, 2018                                       
 **********************************************/
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		System.out.println("Area Program: Enter C for Circle, S for Square, R for Rectangle");
		
		String userInput=input.nextLine();

		if(userInput.equals("C")){
			System.out.println("Enter the radius of the circle:");
			
			double radius=input.nextDouble();
			
			System.out.println("Area of the circle is =" + " " +3.14 * radius * radius);
}

		else if (userInput.equals("S")){
			System.out.println("Enter the length of the square sides:");
			
			double Length=input.nextDouble();
			
			System.out.println("Area of the square is= " + " "+ Length * Length);
}

		else if (userInput.equals("R")){
			System.out.println("Enter the side length of the rectangle:");
			
			double Length=input.nextDouble();

			System.out.println("Enter the side height of the rectangle:");

			double Height=input.nextDouble();

			System.out.println("Area of the rectangle is=" + " "+ Length * Height);
}
		
	}
}//endClass