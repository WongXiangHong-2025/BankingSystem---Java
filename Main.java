/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SA001", "Ali", 1000, 0.05);
        CurrentAccount ca = new CurrentAccount("CA001", "Abu", 500, 300);

        System.out.println("=== Savings Account ===");
        sa.displayInfo();
        sa.deposit(200);
        sa.withdraw(500);
        System.out.println("Interest: RM" + sa.calculateInterest());

        System.out.println("\n=== Current Account ===");
        ca.displayInfo();
        ca.withdraw(700);
        System.out.println("Interest: RM" + ca.calculateInterest());
    }
}
