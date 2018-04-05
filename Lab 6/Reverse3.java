/**********************************************
 *          Lab #6c                                             
 *         Nora Thelma                                        
 *        February 28th, 2018                                       
 **********************************************/


public class Reverse3{

    public static void main(String[] args) {
		    char name[]={'S','t','e','v','e'};
			System.out.println("Array before reversal:");
			System.out.println(name);
			System.out.println("Array after reversal:");
			reverse3(name);
		
	}// end main
	public static void reverse3 (char[] nameArray) {
			for(int x = (nameArray.length); x > 0; x--){
			System.out.print (nameArray[x-1]);
			}
		
	}//end reverse3
	
}//endClass