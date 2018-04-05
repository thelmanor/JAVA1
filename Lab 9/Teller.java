/**********************************************
 *          Lab #9c                                            
 *         Nora Thelma                                        
 *        March 21th, 2018                                       
 **********************************************/
 public class Teller extends Employee{
		 
		private double hrsworked;
		private String shift;
		
		public Teller() {
			super();
			sethrsworked(0.0);
			setshift("");
			}
		public Teller(String fn,String ln,String a,String e,int id,double sa, double hw,String sh) {
			super(fn,ln,a,e,id,sa);
			sethrsworked(hw);
			setshift(sh);
			}
			
		public void sethrsworked(double hw){hrsworked=hw;}
		public double gethrsworked() {return hrsworked;} 
		 
		public void setshift (String sh){shift=sh;}
		public String getshift() {return shift;} 
		
		public void display(){
		super.display();
		System.out.println("Hours worked=" + gethrsworked());
		System.out.println("shift=" + getshift());
		}
		 
	 }//end class Teller