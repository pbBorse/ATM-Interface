package que;


public class BankAccount
{
	    public static void main(String[] args) 
        {
	    Bankacc obj = new Bankacc("7796747593","Raj");
	    obj.deposit(300);
	    obj.withdraw(100);
	    obj.displayaccuntdetails();
	    
	    Bankacc obj2 = new Bankacc("78765746465","Priyanka");
	    obj2.deposit(1000);
	    obj2.withdraw(369);
	    obj2.displayaccuntdetails();
	    }
}
