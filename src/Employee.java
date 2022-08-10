public class Employee {
    String employeeName;
    int employeeCode;
    int employeeAge;
    String dob;
    String addresss;
    double salary;

    Employee(String employeeName, int employeeCode, String dob, String addresss, double salary) {
        this.employeeName = employeeName;
        this.employeeCode = employeeCode;
        this.employeeAge = employeeAge;
        this.dob = dob;
        this.addresss = addresss;
        this.salary = salary;
    }

    public double annualSalary() {
        return salary * 12;
    }

    public double payRise(double hikePercentage) {
        salary = salary + (salary * hikePercentage / 100);
        return salary;
    }
}
