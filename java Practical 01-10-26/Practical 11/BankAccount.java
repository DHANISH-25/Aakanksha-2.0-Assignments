
/*11\. Write a Java program to create a `BankAccount` class with `deposit()`, `withdraw()`, and `checkBalance()` methods */

import java.util.Scanner;

class BankAccount{
    double balance = 953958.00;

    void deposit(double depositBalance){
        System.out.println("Your Balance: " + balance);
        balance += depositBalance;
        System.out.println("Deposited: ₹" + balance);
    }

    void withdraw(double withdrawAmount){
        System.out.println("Your Balance: " + balance);
        if (withdrawAmount > balance) {
            System.out.println("Insufficient Balance.");
        }else{
            balance -= withdrawAmount;
        }
        System.out.println("Your current Balance: " + balance);

    }

    void checkBalance(){
        System.out.println("Your Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount obj = new BankAccount();
        System.out.println("Welcome to Ambani Loot Bank.");
        System.out.println("What do you want to do?");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Check Balance");
        System.out.println("Choose an option(1,2,3): ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter the Amount: ");
                double depositBalance = sc.nextDouble();
                obj.deposit(depositBalance);
                break;
            case 2:
                System.out.println("Enter the Amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                obj.withdraw(withdrawAmount);
                break;
            case 3:
                obj.checkBalance();
                break;
        
            default:
                System.out.println("Invalid Option...");
                break;
        }

        sc.close();
    }
}