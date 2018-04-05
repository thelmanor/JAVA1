/**********************************************
 *          Lab #8b                                            
 *         Nora Thelma                                        
 *        March 14th, 2018                                       
 **********************************************/


public class Account{
	private int accountNo;
	private String accountName;
	private double accountBal;
	
	public Account(){
		setaccountNo(0);
		setaccountName("");
		setaccountBal(0.0);
		
	}
	public Account(int ac,String an,double ab){
		setaccountNo(ac);
		setaccountName(an);
		setaccountBal(ab);
		
	}
	public void setaccountNo(int ac) {accountNo=ac;}
	public int getaccountNo(){return accountNo;}
	
	public void setaccountName(String an) {accountName=an;}
	public String getaccountName(){return accountName;}
	
	
	public void setaccountBal(double ab) {accountBal=ab;}
	public double getaccountBal(){return accountBal;}
	
	public String toString(){
		return accountNo+":"+accountName+":"+accountBal;		
		}
	
	public void display(){
		System.out.println("accountNo  =" + getaccountNo());
		System.out.println("accountName=" + getaccountName());
		System.out.println("accountBal=" + getaccountBal());
		}
    public static void main (String arg[]){
		Account a1;
		a1= new Account(5000, "Thelma Nora", 5000000.00);
		a1.display();
		
		Account a2=new Account();
		a2.setaccountNo(56982);
		a2.setaccountName("John Smith");
		a2.setaccountBal(500.63);
		a2.display();
	}
	}