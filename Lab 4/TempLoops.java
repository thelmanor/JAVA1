/**********************************************
 *          Lab #4a                                             
 *         Nora Thelma                                        
 *        February 7, 2018                                       
 **********************************************/
 

public class TempLoops{

	public static void main(String[] args) {	 

		System.out.println("print the Celsius equivalent to Fahrenheit ");
		
		int fahr=0;
		double celsius;
		
	
		
		System.out.println("For Loop Table");
		System.out.println("Fahr.          Celsuis");
		
		for (fahr=0;fahr<=300;fahr+=20){		
			celsius=(5.0/9.0)*(fahr-32.0);
			System.out.println(fahr+" "+"="+" "+celsius+" ");
		}
		
		fahr=0;
		System.out.println("While Loop Table");
		System.out.println("Fahr.       Celsuis");
		
		while(fahr<=300){
			celsius=(5.0/9.0)*(fahr-32.0);
			System.out.println(fahr+" "+"="+" "+celsius+" ");
			fahr=fahr+20;
		}			
			fahr=0;
		System.out.println("Do Loop Table");
		System.out.println("Fahr.     Celsuis");
		do {
			celsius=(5.0/9.0)*(fahr-32.0);
			System.out.println(fahr+" "+"="+" "+celsius+" ");
			fahr=fahr+20;
		} while (fahr<=300);
		
		
	}
} //endClass