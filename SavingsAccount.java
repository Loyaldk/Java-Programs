
import java.lang.Math;
import java.util.Scanner;

public class SavingsAccount {
	
	//Declare variables
	private int id, opt;
	private double balance, annualIntRate;
	java.util.Date dateEstablished = new java.util.Date();
	
	//Call for inputs
	public SavingsAccount(int newid, double newbalance) {
		this.setId(newid);
		this.setBalance(newbalance);
	}
	
	//Interest
	public void SetInterest(double IntRate) {
		this.annualIntRate = IntRate;
	}
	
	public double getInterest() {
        return this.annualIntRate;
    }
	
    //Weekly
    public double getWeeklyRate() {
    	return this.getInterest() / 52.0;
    }
    
    //Monthly
    public double getWeeklyIntRate() {
    	//Accurately calculate to the 2nd decimal point.
    	double temp = this.getBalance() * this.getWeeklyRate();
    	double temp1 = Math.round(temp * 100.0) / 100.0;
    	return temp1;
    }
	
	//ID
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    //Balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    //Date
    public String getDateEstablished() {
        return this.dateEstablished.toString();
    }
	
    //Deposit
    public void deposit(double amount) {
        this.balance += amount;
    }
    
    public void depositAmt(double amount) {
    	this.setBalance(getBalance()+amount); 
    }
}