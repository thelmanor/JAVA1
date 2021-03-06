/**********************************************
 *          Lab #8c                                          
 *         Nora Thelma                                        
 *        March 14th, 2018                                       
 **********************************************/


public class Person{
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	
	public Person(){
		setfirstName("");
		setlastName("");
		setaddress("");
		setemail("");		
	}
	public Person(String fn, String ln, String a,String e){
		setfirstName(fn);
		setlastName(ln);
		setaddress(a);
		setemail(e);
	}
	
	public void setfirstName(String fn) {firstName=fn;}
	public String getfirstName(){return firstName;}
	
	public void setlastName(String ln) {lastName=ln;}
	public String getlastName(){return lastName;}
	
	
	public void setaddress(String a) {address=a;}
	public String getaddress(){return address;}
	
	public void setemail(String e) {email=e;}
	public String getemail(){return email;}
	
	public String toString(){
		return firstName+":"+lastName+":"+address+":"+email;		
		}
	
	public void display(){
		System.out.println("firstName  =" + getfirstName());
		System.out.println("lastName=" + getlastName());
		System.out.println("address=" + getaddress());
		System.out.println("email=" + getemail());
		}
    public static void main (String arg[]){
		Person p1;
		p1= new Person();
		p1.setfirstName("Thelma");
		p1.setlastName("Nora");
		p1.setaddress("Atlanta");
		p1.setemail("thelmanora@hotmail.com");
		p1.display();
		
		Person p2=new Person("John", "Adam","Marietta", "tnora@yahoo.com");
		p2.display();
	}
	}