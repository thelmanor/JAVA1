/**********************************************
 *          Lab #4c                                              
 *         Nora Thelma                                        
 *        February 7, 2018                                       
 **********************************************/
import java.util.Scanner;

public class wArea {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
					
		String userInput= "";
		
		String end= "X";
		
		System.out.println("Area Program: Enter C for Circle, S for Square, R for Rectangle");
		
		userInput=input.nextLine();
		
		do{
			
			if(userInput.equals("C")){
			
			System.out.println("Enter the radius of the circle:");
			
			double radius=input.nextDouble();			
			
			System.out.println("Area of the circle is =" + " " +3.14 * Circle);
						
			}
		
			else if  (userInput.equals("S")){
			
			System.out.println("Enter the length of the square sides:");
			
			double =input.nextDouble();			
			
			System.out.println("Area of the square is= " + " "+ Square);
			
			
			}			
			
			else if (userInput.equals("R")){
				
			System.out.println("Enter the side length of the rectangle:");
			
			double Length=input.nextDouble();

			System.out.println("Enter the side height of the rectangle:");

			double Height=input.nextDouble();		

			System.out.println("Area of the rectangle is=" + " "+ Rectangle);

			}	
			
			System.out.println("Area Program: Enter C for Circle, S for Square, R for Rectangle");
			
			userInput=input.nextLine();
			
			if (userInput.equals("X"))
				
				System.exit(0);
		
	}while (userInput!=("X"));
	

			
	
	}//end main
}//endClass


