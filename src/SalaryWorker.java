public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, double annualSalary) {
        super(firstName, lastName, ID, 0); // hourlyRate not used
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        System.out.printf("%s %s (%s)\n", getFirstName(), getLastName(), getID());
        System.out.printf("Weekly Salary Pay: $%.2f\n\n", calculateWeeklyPay(hoursWorked));
    }
}
