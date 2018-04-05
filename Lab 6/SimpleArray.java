/**********************************************
 *          Lab #6a                                             
 *         Nora Thelma                                        
 *        February 28th, 2018                                       
 **********************************************/


public class SimpleArray {

    public static void main(String[] args) {
		
		int[] array;
		
		array= new int[100];
		
		for(int x=0; x<100; x++){
			array[x]=x+500;
		}
	 
		for(int x=0; x<100; x++){
			System.out.println ("array[" + x +"]=" + array[x]);
		}
		
	} //end main	
	
}//endClass