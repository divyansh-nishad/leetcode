public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        int max = 999;
        int min = Integer.MAX_VALUE;
        int n = salary.length;
        double avg = 0;
        for (int i = 0; i < n; i++) {
            avg += salary[i];
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
        }
        avg -= min;
        avg -= max;
        avg /= (n - 2);
        return avg;
    }
}
