class BankAccount {
	String accountHolderName;
	int accountNo;
	double currentBalance;
	int contactNo;
	int panCardNo;
	int adharNo;
	
	//constructors
	BankAccount (){
		this.accountHolderName = "Dhananjay";
		this.accountNo = 101;
		this.currentBalance = 50000;
		this.contactNo = 80801678;
		this.panCardNo = 2345;
		this.adharNo = 54434050;
	}
	
	BankAccount(String accountHolderName, int accountNo, double currentBalance, int contactNo,int panCardNo, int adharNo) {
		this.accountHolderName = accountHolderName;
		this.accountNo = accountNo;
		this.currentBalance = currentBalance;
		this.contactNo = contactNo;
		this.panCardNo = panCardNo;
		this.adharNo = adharNo;
	}

	String getAccountHolderName() {
		return accountHolderName;
	}

	void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	int getAccountNo() {
		return accountNo;
	}

	void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	double getCurrentBalance() {
		return currentBalance;
	}

	void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	int getContactNo() {
		return contactNo;
	}

	void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	int getPanCardNo() {
		return panCardNo;
	}

	void setPanCardNo(int panCardNo) {
		this.panCardNo = panCardNo;
	}

	int getAdharNo() {
		return adharNo;
	}

	void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}
	
	void display () {
		System.out.println("Account Holder Name is :"+this.accountHolderName);
		System.out.println("Account Number is :"+this.accountNo);
		System.out.println("Current balance is :"+this.currentBalance);
		System.out.println("Contact number is :"+this.contactNo);
		System.out.println("Pan number is :"+this.panCardNo);
		System.out.println("Adhar number is :"+this.adharNo);
	}

	
}//Bank account class ends here

class SavingAccount extends BankAccount {
	double minBalanceLimit;
	double fdInterest;
	double withdrawalLimit;
	SavingAccount() {
		super();
		this.minBalanceLimit = 40000;
		this.fdInterest = 10;
		this.withdrawalLimit = 10000;
	}
	
	SavingAccount(String accountHolderName,int accountNo,double currentBalance,int contactNo,int panCardNo,
	int adharNo,double minBalanceLimit, double fdInterest, double withdrawalLimit) {
		super(accountHolderName,accountNo,currentBalance,contactNo,panCardNo,adharNo);
		this.minBalanceLimit = minBalanceLimit;
		this.fdInterest = fdInterest;
		this.withdrawalLimit = withdrawalLimit;
	}

	double getMinBalanceLimit() {
		return minBalanceLimit;
	}

	void setMinBalanceLimit(double minBalanceLimit) {
		this.minBalanceLimit = minBalanceLimit;
	}

	double getFdInterest() {
		return fdInterest;
	}

	void setFdInterest(double fdInterest) {
		this.fdInterest = fdInterest;
	}

	double getWithdrawalLimit() {
		return withdrawalLimit;
	}

	void setWithdrawalLimit(double withdrawalLimit) {
		this.withdrawalLimit = withdrawalLimit;
	}
	
	void display () {
		super.display();
		System.out.println("Min balace limit is  :"+this.minBalanceLimit);
		System.out.println("Fd Interest is :"+this.fdInterest);
		System.out.println("Withdrawal limit is :"+this.withdrawalLimit);
	}
}//saving account class ends here

class CurrentAccount extends BankAccount{
	double overDraftLimit;
	String businessName;
	double overDraftBalance;
	CurrentAccount() {
		super();
		this.overDraftLimit = 10000;
		this.businessName = "Dairy";
		this.overDraftBalance = 52300;
	}
	
	CurrentAccount(String accountHolderName,int accountNo,double currentBalance,int contactNo,int panCardNo,
			int adharNo,double overDraftLimit, String businessName, double overDraftBalance) {
		super(accountHolderName,accountNo,currentBalance,contactNo,panCardNo,adharNo);
		this.overDraftLimit = overDraftLimit;
		this.businessName = businessName;
		this.overDraftBalance = overDraftBalance;
	}

	double getOverDraftLimit() {
		return overDraftLimit;
	}

	void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	String getBusinessName() {
		return businessName;
	}

	void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	double getOverDraftBalance() {
		return overDraftBalance;
	}

	void setOverDraftBalance(double overDraftBalance) {
		this.overDraftBalance = overDraftBalance;
	}
	
	void display () {
		super.display();
		System.out.println("Overdraft limit is : "+this.overDraftLimit);
		System.out.println("Business name is : "+this.businessName);
		System.out.println("Overdraft Balance is : "+this.overDraftLimit);
	}
}//Current account ends here

class LoanAccount extends BankAccount {
	double loanAmount;
	double paidAmount;
	double remainingAmount;
	LoanAccount() {
		super();
		this.loanAmount = 100000;
		this.paidAmount = 30000;
		this.remainingAmount = 70000;
	}
	LoanAccount(String accountHolderName,int accountNo,double currentBalance,int contactNo,int panCardNo,
			int adharNo,double loangAmount, double paidAmount, double remainingAmount) {
		super(accountHolderName,accountNo,currentBalance,contactNo,panCardNo,adharNo);
		this.loanAmount = loangAmount;
		this.paidAmount = paidAmount;
		this.remainingAmount = remainingAmount;
	}
	double getLoangAmount() {
		return loanAmount;
	}
	void setLoangAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	double getPaidAmount() {
		return paidAmount;
	}
	void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	double getRemainingAmount() {
		return remainingAmount;
	}
	void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

	void display () {
		super.display();
		System.out.println("Loan amount is : "+ this.loanAmount);
		System.out.println("Paid amount is : "+this.paidAmount);
		System.out.println("Remaining amount is : "+this.remainingAmount);
	}
}//loan account ends here


class TestBank {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount ();
		b1.display();
		
		System.out.println();
		
		BankAccount b2 = new BankAccount ("Akshay",143,20000,8976558,3475637,9876543);
		b2.display();
		
		System.out.println();
		
		SavingAccount s1 = new SavingAccount ();
		s1.display();
		
		System.out.println();
		
		SavingAccount s2 = new SavingAccount ("Sarthak",235,40000,4567854,456786,345567,60000,9,20000);
		s2.display();
		
		System.out.println();

		LoanAccount l1 = new LoanAccount ();
		l1.display();
		
		System.out.println();

		
		LoanAccount l2 = new LoanAccount ("Ketan",101,30000,34567,76543,234567,80000,10,30000);
		l2.display();
		System.out.println();
		
		CurrentAccount c1  = new CurrentAccount ();
		c1.display();
		System.out.println();
		
		CurrentAccount c2 = new CurrentAccount ("Chaitanya",111,23456,67890,56789,90000,20000,"Dairy",89588);
		c2.display();
		
	}

}