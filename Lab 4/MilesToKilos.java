/**********************************************
 *         Lab 4b                                            
 *         Nora Thelma                                        
 *        February 7, 2018                                       
 **********************************************/
 

public class MilesToKilos{

	public static void main(String[] args) {	
	
	System.out.println("Miles     Kilos");	

		double kilos=0;
		int miles=1;
		while(miles<=100){
			kilos=miles*1.609;
			System.out.println(miles + "        " + kilos);
			miles=miles+1;
		}
	}
} //endClass