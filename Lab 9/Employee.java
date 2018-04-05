/**********************************************
 *          Lab #9a                                            
 *         Nora Thelma                                        
 *        March 21th, 2018                                       
 **********************************************/
	 
	 public class Employee extends Person{
		 
		private int employeeID;
		private double salary;
		
		public Employee() {
			super();
			setemployeeID(0);
			setsalary(0.0);
			}
		public Employee(String fn,String ln,String a,String e,int id,double sa) {
			super(fn,ln,a,e);
			setemployeeID(id);
			setsalary(sa);
			}			
		public void setemployeeID(int id){employeeID=id;}
		public int getemployeeID() {return employeeID;} 
		 
		public void setsalary (double sa){salary=sa;}
		public double getsalary() {return salary;} 
		
		public void display(){
		super.display();
		System.out.println("employeeID=" + getemployeeID());
		System.out.println("salary=" + getsalary());
		}
		
 public static void main (String arg[]){
		Employee e1;
		e1= new Employee("Bill", "Clinton", "Marietta", "bc@msn.com",2323,4300.00);
		e1.display();
 }
		 
	 }//end class Employee
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
