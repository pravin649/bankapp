package bankAppWithArrays;

public class SavingsAccount implements Account
{
	private int accNo;
	private double accBal;
	public SavingsAccount(int accNo, double accBal) 
	{
		System.out.println("SavingsAccount Created Successfully....!!!");
		this.accNo = accNo;
		this.accBal = accBal;
	}
	@Override
	public void deposit(double amt) 
	{
		System.out.println("Depositing amount in SavingsAccount="+amt);
		accBal=accBal+amt;
		balanceEnquiry();
	}
	@Override
	public void withdraw(double amt) 
	{
		System.out.println("Withdrawing Amount from SavingsAccount="+amt);
		accBal=accBal-amt;
		balanceEnquiry();
	}
	@Override
	public void balanceEnquiry() 
	{
		System.out.println("Your Current Balance in SavingsAccount="+accBal);
	}
	public int getAccNo() 
	{
		return accNo;
	}
	
}
