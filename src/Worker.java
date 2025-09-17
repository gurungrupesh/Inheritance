public class Worker extends Person {
    private double hourlyRate;

    public Worker(String firstName, String lastName, String ID, double hourlyRate) {
        super(firstName, lastName, ID);
        this.hourlyRate = hourlyRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(40, hoursWorked);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return (regularHours * hourlyRate) + (overtimeHours * (hourlyRate * 1.5));
    }

    public void displayWeeklyPay(double hoursWorked) {
        double regularHours = Math.min(40, hoursWorked);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularPay = regularHours * hourlyRate;
        double overtimePay = overtimeHours * hourlyRate * 1.5;
        double totalPay = regularPay + overtimePay;

        System.out.printf("%s (%s)\n", getFirstName(), getID());
        System.out.printf("Regular Hours: %.2f, Pay: $%.2f\n", regularHours, regularPay);
        System.out.printf("Overtime Hours: %.2f, Pay: $%.2f\n", overtimeHours, overtimePay);
        System.out.printf("Total Pay: $%.2f\n\n", totalPay);
    }
}
