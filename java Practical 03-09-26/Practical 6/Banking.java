public class Banking {
    static String bankName = "Bank of India";
    String accountHolder = "Dhanish kumar";
    double balance = 20000;

    void accountDetails() {
        System.out.println(bankName);
        System.out.println(accountHolder);
        System.out.println(balance);
    }

    public static void main(String[] args) {
        Banking info = new Banking();
        info.accountDetails();
    }
}
