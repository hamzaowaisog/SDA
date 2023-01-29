public class Task1 {
    public static void main(String[] args) {
        FullTimeEmployee fe = new FullTimeEmployee("Silat Tex",800,48);
        Contractor cs = new Contractor(500,48,"Moiz & Co");

        System.out.println("Full Time Employee");
        fe.name();
        fe.CalculateSalary();

        System.out.println("\nContractor");
        cs.printname();
        cs.printname();
    }
}
