/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class CurrentAccount extends Account {

    private double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw
    @Override
    public void withdraw(double amount) {
        if (balance - amount < -overdraftLimit) {
            System.out.println("Overdraft limit exceeded!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: RM" + amount);
        }
    }

    // Override calculateInterest (no interest)
    @Override
    public double calculateInterest() {
        return 0;
    }
}
