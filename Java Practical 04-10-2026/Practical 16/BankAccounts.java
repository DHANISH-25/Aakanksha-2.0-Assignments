import java.util.Scanner;

class BankAccounts {
    String name;
    double balance;

    BankAccounts(String n, double b) {
        name = n;
        balance = b;
    }

    void deposit(double newBalance) {
        System.out.println("Balance : " + balance);
        balance += newBalance;
        System.out.println("New Balance : " + balance);
    }

    void withdrawl(double newBalance1) {
        System.out.println("Balance : " + balance);

        if (newBalance1 > balance) {
            System.out.println("You Don't have that much money!!");
        } else {
            balance -= newBalance1;
            System.out.println("New Balance is : " + balance);
        }

    }

    void checkBalance() {
        System.out.println("Your Balance is : " + balance);
    }

    public static void main(String[] args) {
        BankAccounts obj = new BankAccounts("Krishna", 50000.00);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to KBI");
        System.out.println("1.Deposit");
        System.out.println("2.Withdrawl");
        System.out.println("3.Check Balance");

        System.out.println("What do you want to do ? ");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Enter the Deposit Amount : ");
                double newBalance = sc.nextDouble();
                obj.deposit(newBalance);
                break;

            case 2:
                System.out.println("Enter the Withdrawl Amount : ");
                double newBalance1 = sc.nextDouble();
                obj.withdrawl(newBalance1);
                break;

            case 3:
                obj.checkBalance();
                break;

            default:

                break;
        }
        sc.close();
    }
}
