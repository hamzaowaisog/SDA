public class Contractor extends Employee{
    int hour ;
    int month;

    public Contractor(int hour, int month, String name) {
        this.name = name;
        this.hour = hour;
        this.month = month;
    }

    @Override
    void CalculateSalary() {
        int salary = hour*month;
        System.out.println("The Salary of the employee is "+salary);
    }
    void printname(){
        System.out.println("The name of organization is "+name);
    }
}
