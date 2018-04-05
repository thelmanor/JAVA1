/**********************************************
 *          Lab #5d                                            
 *         Nora Thelma                                        
 *        February 21st, 2018                                       
 **********************************************/
import java.util.Scanner;

public class mArea {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
					
		String userInput= "";
		
		System.out.println("Area Program: Enter C for Circle, S for Square, R for Rectangle");
		
		userInput=input.nextLine();
		
		do{
			
		
		if (userInput.equals("C")){
			
			System.out.println("Enter the radius of the circle:");
			
			double radius=input.nextDouble();
			
			double circleArea = circle(radius);
			
			System.out.println("Area of the circle is =" + " " + circleArea);
			
			userInput=input.nextLine();	
			
			System.out.println("Area Program: Enter C for Circle, S for Square, R for Rectangle");
						
			}
		
			else if  (userInput.equals("S")){
			
			System.out.println("Enter the length of the square sides:");
			
			double length=input.nextDouble();
			
			double squareArea = square(length);
			
			System.out.println("Area of the square is= " + " "+ squareArea);
			
			userInput=input.nextLine();	
			
			System.out.println("Area Program: Enter C for Circle, S for Square, R for Rectangle");
			
			
			}			
			
			else if (userInput.equals("R")){
				
			System.out.println("Enter the side length of the rectangle:");
			
			double Length=input.nextDouble();

			System.out.println("Enter the side height of the rectangle:");

			double Height=input.nextDouble();
			
			double rectangleArea = rectangle(Length,Height);

			System.out.println("Area of the rectangle is=" + " "+ rectangleArea);
			
			userInput=input.nextLine();	
			
			System.out.println("Area Program: Enter C for Circle, S for Square, R for Rectangle");

			} 	
			
			userInput=input.nextLine();
			
				if (userInput.equals("X"))
				
				System.exit(0);
		
	}while (userInput!=("X"));	//end loop			
		
	}//end main
	public static double circle(double radius) {
        double area =3.14 * radius * radius;
        return area;
    }// end circle method
 
    public static double square(double length) {
        double area = length * length;
        return area;
    }//end square method
 
    public static double rectangle(double Length, double Height) {
        double area = Length * Height;
        return area;   
	
	} //end rectangle method
}//endClass