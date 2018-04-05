/**********************************************
 *          Lab #5b                                              
 *         Nora Thelma                                        
 *        February 21st, 2018                                       
 **********************************************/


public class MaxClass {

    public static void main(String[] args) {
		int firstn=5;
		int secondn=9;
		int thirdn=2;
		int ans;
		ans= max(firstn, secondn, thirdn);
		System.out.println("The max number is :" + ans);
		
	} //end main
	
	public static int max(int firstn, int secondn, int thirdn){
		
		
		if(firstn>secondn && firstn>thirdn){
			return firstn;
		}
			else if (secondn>firstn && secondn>thirdn){
				return secondn;
			}	
		else {
				return thirdn;
			}
		
}//end max
}//endClass