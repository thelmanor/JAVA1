/**********************************************
 *          Lab #5c                                             
 *         Nora Thelma                                        
 *        February 21st, 2018                                       
 **********************************************/
import java.util.Scanner;

public class AvgClass {

    public static void main(String[] args) {
		double a,b,c,d;
		double ans;
		
	System.out.println ("Enter numbers");
	
	Scanner number = new Scanner(System.in);
	
    a = number.nextDouble();
    b = number.nextDouble();
	c = number.nextDouble();
    d = number.nextDouble();
	ans=avg(a,b,c,d);
	
	System.out.println ("The avg of the 4 numbers is:"+ ans);
	} //end main
	
	public static double avg(double a, double b, double c, double d){
		  double average = (a+b+c+d)/4.0;
  
  return average;
}// end avg method

}//endClass