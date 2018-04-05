/**********************************************
 *          Lab #9b                                            
 *         Nora Thelma                                        
 *        March 21th, 2018                                       
 **********************************************/
 public class Student extends Person{
		 
		private int StudentID;
		private String major;
		private double gpa;
		
		public Student() {
			super();
			setStudentID(0);
			setmajor("");
			setgpa(0.0);
			}
		public Student(String fn,String ln,String a,String e,int id,String ma,double g) {
			super(fn,ln,a,e);
			setStudentID(id);
			setmajor(ma);
			setgpa(g);
			}
			
		public void setStudentID(int id){StudentID=id;}
		public int getStudentID() {return StudentID;} 
		
		public void setmajor(String ma){major=ma;}
		public String getmajor() {return major;}
		 
		public void setgpa (double g){gpa=g;}
		public double getgpa() {return gpa;} 
		
		public void display(){
		super.display();
		System.out.println("StudentID=" + getStudentID());
		System.out.println("major=" + getmajor());
		System.out.println("gpa=" + getgpa());
		}
		
 public static void main (String arg[]){
		Student s1;
		s1= new Student("Thelma", "Nora", "Kennesaw", "tnora@msn.com", 50639, "Computer Programming", 4.0);
		s1.display();
 }
}// end class Student