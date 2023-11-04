package que;

public class Bankacc {
	
	    private String accountnumber, accountholdername;
	    private double  balance =0.0;

		public Bankacc (String accountnumber, String accountholdername)
		{
			this.accountnumber = accountnumber;
			this.accountholdername = accountholdername;
		}
		void deposit (double amount)
		{
			 balance += amount;
		}
		void withdraw (double amount)
		{
			balance -= amount;
		}
		void displayaccuntdetails()
		{
			System.out.println("Account number  : " + accountnumber);
	     	System.out.println("Account holder name : " + accountholdername);
	     	System.out.println("current balance : " + balance);
		}
	}
		
