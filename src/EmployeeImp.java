public class EmployeeImp {
    public static void main(String[] args) {
        Employee daniel = new Employee("Demiel", 130, "21/465/454", "546556545jhhj", 3000);
        double annualSalary = daniel.annualSalary();
        System.out.println("Annual Salary = " + annualSalary);
        System.out.println("Monthly before pay rise = " + daniel.salary);
        daniel.payRise(20);
        System.out.println("Monthly after pay rise = " + daniel.salary);
    }
}
