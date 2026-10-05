public class BankAccount {
    String holderName;
    int accountNumber;
    double intialBalance;

    BankAccount(String h,int a, double i) {
        holderName = h;
        accountNumber = a;
        intialBalance = i;
    }

    void display() {
        System.out.println("Your current balance: " + intialBalance);
    }

    void deposit(double deposit) {
        double updatedBalance = intialBalance + deposit;
        System.out.println("Your total Balance: " + updatedBalance);
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Rahul",123456,50000.00);
        ba.display();
        ba.deposit(5000.00);
    }
}
