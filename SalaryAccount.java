package test.qat1;

public class SalaryAccount implements BankAccount{
	@Override
	public void checkBankBalance() {
		System.out.println("the balance is 1,00,000");
		
	}

	@Override
	public void VerifyUser() {
		System.out.println("Verified current account holder");
	}

}
