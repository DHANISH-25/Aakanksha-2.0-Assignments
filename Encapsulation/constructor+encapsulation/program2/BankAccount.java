public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        setBalance(balance);
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance! Balance cannot be negative.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(5000);
        BankAccount b2 = new BankAccount(-1000);

        b1.display();
        b2.display();
    }
}
