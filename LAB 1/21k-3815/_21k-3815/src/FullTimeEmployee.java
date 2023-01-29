public class FullTimeEmployee extends Employee {
    int hour ;
    int month;
    public FullTimeEmployee(String name , int hour , int month) {
        this.name = name;
        this.hour = hour;
        this.month = month;
    }

    @Override
    void CalculateSalary() {
        int salary = hour*month;
        System.out.printf("Salary of the employee is "+salary);
    }
    void name(){
        System.out.println("Name of Organization is "+name);
    }
}
