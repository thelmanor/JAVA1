/**********************************************
 *          Lab #7b                                            
 *         Nora Thelma                                        
 *        March 7th, 2018                                       
 **********************************************/


public class Account{
	private int accountNo;
	private String accountName;
	private double accountBal;
	
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
		a1= new Account();
		a1.setaccountNo(56982);
		a1.setaccountName("John Smith");
		a1.setaccountBal(500.63);
		a1.display();
	}
	}