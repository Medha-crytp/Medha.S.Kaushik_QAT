package test.qat1;

public class SavingsAccount implements BankAccount {
	@Override
	public void checkBankBalance() {
				System.out.println("the balance is 50,000");
				}
		
	

	@Override
	public void VerifyUser() {
		System.out.println("User account type is savings account");
		
	}
	

}
