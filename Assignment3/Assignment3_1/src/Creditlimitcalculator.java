import java.util.Scanner;

/*Q1. (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".*/

public class Creditlimitcalculator {

	private int accNo;
	private int balance;
	private int chargeMonth;
	private int creditMonth;
	private int creditLimit;
	
	public Creditlimitcalculator()
	{
		
		this.accNo = 9021;
		this.balance = 0;
		this.chargeMonth = 0;
		this.creditMonth = 0;
		this.creditLimit = 0;
	}
		
	public Creditlimitcalculator(int accNo, int balance, int chargeMonth, int creditMonth, int creditLimit) {
		
		this.accNo = accNo;
		this.balance = balance;
		this.chargeMonth = chargeMonth;
		this.creditMonth = creditMonth;
		this.creditLimit = creditLimit;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getChargeMonth() {
		return chargeMonth;
	}

	public void setChargeMonth(int chargeMonth) {
		this.chargeMonth = chargeMonth;
	}

	public int getCreditMonth() {
		return creditMonth;
	}

	public void setCreditMonth(int creditMonth) {
		this.creditMonth = creditMonth;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	void accpetData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number : ");
		this.accNo = sc.nextInt();
		System.out.print("Enter balance : ");
		this.balance = sc.nextInt();
		System.out.print("Enter total items charged : ");
		this.chargeMonth = sc.nextInt();
		System.out.print("Enter total credits applied this month : ");
		this.creditMonth = sc.nextInt();
		System.out.print("Enter credit limit : ");
		this.creditLimit = sc.nextInt();	
	}

	void displayData()
	{
		System.out.println("Account number : "+this.accNo);
		System.out.println("Balance : "+this.balance);
		System.out.println("Total items charged : "+this.chargeMonth);
		System.out.println("Total credits applied this month : "+this.creditMonth);
		System.out.println("Credit limit : "+this.creditLimit);
	}
	
	void new_balance()
	{
		int newBalance = this.balance + this.chargeMonth + this.creditMonth;
		if(newBalance>this.creditLimit)
		{
			System.out.println("Crediit limit exceeded");
		}
		else
		{
			System.out.println("Total amount : "+newBalance);
		}
	}
		
	public static void main(String[] args)
	{
		Creditlimitcalculator c = new Creditlimitcalculator();
		c.accpetData();
		c.displayData();
		c.new_balance();
				
	
	}
}
