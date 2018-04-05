/**********************************************
 *          Lab #2c                                               *
 *         Nora Thelma                                        *
 *        Jan 31, 2018                                        *
 **********************************************/
 import java.util.Scanner;
public class Convert {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter degree in fahrenheit:");
		double fahr=input.nextDouble();
		double celsius=(5.0/9.0)*(fahr-32.0);
		System.out.println(fahr+" "+"Fahrenheit"+"="+"   "+celsius+" "+"celsius");
	}
}//endClass