/**********************************************
 *          Lab #8a                                            
 *         Nora Thelma                                        
 *        March 14th, 2018                                       
 **********************************************/


public class Course{
	private int courseid;
	private String courseName;
	private String description;
	private int creditHours;
	
	public Course(){
		setcourseid(0);
		setcourseName("");
		setdescription("");
		setcreditHours(0);		
		
	}
	public Course(int ci, String cn, String cd, int ch){
		setcourseid(ci);
		setcourseName(cn);
		setdescription(cd);
		setcreditHours(ch);		
		
	}
	public void setcourseid(int ci) {courseid=ci;}
	public int getcourseid(){return courseid;}
	
	public void setcourseName(String cn) {courseName=cn;}
	public String getcourseName(){return courseName;}
	
	public void setdescription(String cd) {description=cd;}
	public String getdescription(){return description;}
	
	public void setcreditHours(int ch) {creditHours=ch;}
	public int getcreditHours(){return creditHours;}
	
	public String toString(){
		return courseid+":"+courseName+":"+description+":"+creditHours;		
		}
		
	public void display(){
		System.out.println("courseid  =" + getcourseid());
		System.out.println("courseName=" + getcourseName());
		System.out.println("description=" + getdescription());
		System.out.println("creditHours=" + getcreditHours());
		}
    public static void main (String arg[]){
		Course c1;
		c1= new Course(323,"intro to Python", "this course intros the python prog lang", 4);
		c1.display();
		
		Course c2;
		c2= new Course();
		c2.setcourseid(109);
		c2.setcourseName("intro to Python");
		c2.setdescription("this course intros the python prog lang");
		c2.setcreditHours(4);
		c2.display();
	}
	}
	
	
	