/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingsystem;

public class Account {

    protected String accountNumber;
    protected String holderName;
    protected double balance;

    // Constructor
    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: RM" + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: RM" + amount);
    }

    // Calculate interest (to be overridden)
    public double calculateInterest() {
        return 0;
    }

    // Display details
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: RM" + balance);
    }
}