public class BankAccount {
    private double balance;

    public void setBalance(double balance){
        if (balance >= 0) {
            this.balance = balance;
        }else{
            System.out.println("Invalid Balance! Negative deposit is not allowed.");
        }
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.setBalance(-542);
        System.out.println("Balance: " + ba.getBalance());

        ba.setBalance(45260);
        System.out.println("Balance: " + ba.getBalance());
    }
    
}
