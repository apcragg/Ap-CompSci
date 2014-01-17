package bankaccount;

public class MoneyMarket extends Savings
{
	private int numWithdrawls = 0;

	public MoneyMarket()
	{
		super();
	}

	public MoneyMarket(int acctNum, String name, double bal, double rate)
	{
		super(acctNum, name, bal, rate);
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(numWithdrawls >= 3) deductPenalty();
		
		if(getBalance() - amount > 0) changeBalance(-amount);
		else System.out.println("Insufficient funds. Penalty still charged.");
		
		numWithdrawls++;
	}

	private void deductPenalty()
	{
		System.out.println("Pentalty applied to " + accountName() + "'s account. Amount charged: " + -getBalance() * .01);
		changeBalance(-getBalance() * .01);
	}
}
