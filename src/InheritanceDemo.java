public class InheritanceDemo {
    public static void main(String[] args) {
        Worker w1 = new Worker("Alice", "Smith", "W001", 20.0);
        Worker w2 = new Worker("Bob", "Jones", "W002", 22.5);
        Worker w3 = new Worker("Charlie", "Brown", "W003", 25.0);

        SalaryWorker s1 = new SalaryWorker("Dana", "White", "S001", 52000);
        SalaryWorker s2 = new SalaryWorker("Eli", "Stone", "S002", 60000);
        SalaryWorker s3 = new SalaryWorker("Fay", "Green", "S003", 48000);

        Worker[] allWorkers = {w1, w2, w3, s1, s2, s3};
        double[] weeklyHours = {40, 50, 40};

        for (int week = 0; week < weeklyHours.length; week++) {
            System.out.println("=== Week " + (week + 1) + " ===");
            for (Worker w : allWorkers) {
                w.displayWeeklyPay(weeklyHours[week]);
            }
        }
    }
}
