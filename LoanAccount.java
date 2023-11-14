package bankAppWithArrays;

public class LoanAccount implements Account
{
	private int accNo;
	private double accBal;
	public LoanAccount(int accNo, double accBal) 
	{
		System.out.println("LoanAccount Created Successfully....!!!");
		this.accNo = accNo;
		this.accBal = accBal;
	}
	@Override
	public void deposit(double amt) 
	{
		System.out.println("Depositing amount in LoanAccount="+amt);
		accBal=accBal-amt;
		balanceEnquiry();
	}
	@Override
	public void withdraw(double amt) 
	{
		System.out.println("Withdrawing Amount from LoanAccount="+amt);
		accBal=accBal+amt;
		balanceEnquiry();
	}
	@Override
	public void balanceEnquiry() 
	{
		System.out.println("Your Current Balance in LoanAccount="+accBal);
	}
	public int getAccNo()
	{
		return accNo;
	}
	
	
}
