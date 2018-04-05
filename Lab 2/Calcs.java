/**********************************************
 *          Lab #2b                                               *
 *         Nora Thelma                                        *
 *        Jan 31, 2018                                        *
 **********************************************/
public class Calcs {
	public static void main(String[] args) {
		int x1=3+4-6/2*3;
		System.out.println("x1="+x1);
		int x2=12%5;
		System.out.println("x2="+x2);
		int y3=4;
		int z3=3;
		int x3=(y3++ + ++z3);		
		System.out.println("x3="+x3);
		int x4=3;
		int y4=x4++ + 4;
		System.out.println("y4="+y4);
		int y5=7;
		int x5=(y5<=4)?3:8;
		System.out.println("x5="+x5);
		int x6=5;
		x6*=3;
		System.out.println("x6="+x6);
	}
}//endClass