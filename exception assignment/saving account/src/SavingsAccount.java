public class SavingsAccount {
	long id;
	double balance=0;
	double amount;
	public void deposit(double amount){
		System.out.println("Enter the wannt to deposit");
		balance=balance+amount;
	}

	public void withdraw(double amount) throws Exception {
		if(amount>balance) {
			throw new Exception("InsufficientBalanceException");
			
		}
		else if(amount <0) {
			throw new Exception("IllegalBankTransctionException");
			
		}
		else {
			balance=balance-amount;
			System.out.println("Balance after widthdrawl:"+balance);
			
		}
		
	}

	

}

