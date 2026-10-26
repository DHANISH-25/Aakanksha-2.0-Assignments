class Login {
    private String password;

    public Login(String password) {
        setPassword(password);
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 6 characters.");
        }
    }

    public String getPassword() {
        return password;
    }

    public void display() {
        System.out.println("Password: " + password);
    }
    public static void main(String[] args) {

        Login l1 = new Login("dha000");
        Login l2 = new Login("dh0");

        l1.display();
        l2.display();
    }
}