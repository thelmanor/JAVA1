/**********************************************
 *          Lab #6b                                             
 *         Nora Thelma                                        
 *        February 28, 2018                                       
 **********************************************/
 

public class TempArray{

	public static void main(String[] args) {	 

		int x;
	
		double[] celsius = new double[320];
		double[] fahrArray = new double[320];		
		
		System.out.println("Fahr.          Celsuis");	

		
		for (x=0;x< celsius.length;x+=20){		
			fahrArray[x]=x+ 0;
		}
		for (x=0;x< celsius.length;x+=20){		
			celsius[x]=(5.0/9.0)*(x-32.0);
		}
		for	(x=0;x< celsius.length;x+=20){
			System.out.println(x+" "+"="+" "+ celsius[x]+ " ");
		}
		
		
		}//end main
	
} //endClass