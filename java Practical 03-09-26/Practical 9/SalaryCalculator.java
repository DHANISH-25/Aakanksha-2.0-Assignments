public class SalaryCalculator {
    String employeeName = "Dhanish kumar";
    double basicSalary;
    static String companyName = "Tata Consultancy Services Ltd.";

    void salaryinput(double basicSalary){
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double totalSalary = hra + da + basicSalary;
        System.out.println("Company name: " + companyName);
        System.out.println("Employee name: " + employeeName);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Employee total salary: " + totalSalary);     
    }

    public static void main(String[] args) {
        SalaryCalculator empsal = new SalaryCalculator();
        empsal.salaryinput(45000.0);
    }
}
