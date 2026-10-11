public class BankAccount {
    int accountNo;
    String holderName;
    double balance;

    BankAccount(int an, String hn) {
        accountNo = an;
        holderName = hn;
    }

    BankAccount(int an, String hn, double b) {
        accountNo = an;
        holderName = hn;
        balance = b;
    }

    void display() {
        System.out.println("Bank account number: " + accountNo);
        System.out.println("Bank holder name: " + holderName);
        System.out.println("Bank accont balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(300124005, "Krishna Sharma");
        BankAccount ba1 = new BankAccount(1000032001, "Dhanish Kumar", 658942.00);
        ba.display();
        ba1.display();
    }
}
