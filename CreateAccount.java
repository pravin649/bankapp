package bankAppWithArrays;

public class CreateAccount 
{
	public static Account openAccount(int accNo,double accBal,String type)
	{
		Account acc=null;
		
		if(type.equals("savings"))
		{
			acc=new SavingsAccount(accNo,accBal);
		}
		else if(type.equals("loan"))
		{
			acc=new LoanAccount(accNo,accBal);
		}
		return acc;
	}
}
