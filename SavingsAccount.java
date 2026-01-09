/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class SavingsAccount extends Account {

    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    // Override calculateInterest
    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    // Override withdraw with rule
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Cannot withdraw. Minimum balance must be RM100.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: RM" + amount);
        }
    }
}
