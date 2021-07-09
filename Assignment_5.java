
//Author Neeraj Patil - 51 Assignment_5
import java.util.*;

class Account {
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	private int accountNo;
	private int accountBalance;
	private String accountPassword;
	private String bankName;

	Account() {
	}
	public Account(int accountNo, int accountBalance, String accountPassword, String bankName) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
        this.accountPassword = accountPassword;
        this.bankName = bankName;
    }

	void displayAccount() {
		System.out.println("---------Account Summary---------");
		System.out.println("Account Number     : " + accountNo);
		System.out.println("Account Balance    : " + accountBalance);
		System.out.println("Account Password   : " + accountPassword);
		System.out.println("Bank Name          : " + bankName);
		System.out.println("");
	}
}

public class Assignment_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acNo;
		int accBal;
		String accPassword;
		String bankName;
		System.out.println("-------|ASSIGNMENT 5|-----------");
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the Account Number    : ");
		acNo = myObj.nextInt();
		System.out.println("Enter the Balance	        :  ");
		accBal = myObj.nextInt();
		System.out.println("Enter the Account Passsword :");
		accPassword = myObj.next();
		System.out.println("Enter the Bank Name 	    : ");
		bankName = myObj.next();

		Account acc = new Account(acNo, accBal, accPassword, bankName);
		acc.displayAccount();
		acc.setBankName("HDFC");
		acc.displayAccount();
		acc.setAccountBalance(1000);
		acc.displayAccount();
		
		
	}

}
