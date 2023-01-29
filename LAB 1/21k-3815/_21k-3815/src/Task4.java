public class Task4 {
    public static void main(String[] args) {
        smartPhone p1 = new smartPhone();
        smartWatch w1 = new smartWatch();

        p1.setColor("Black");
        p1.setName("IPhone");
        p1.setPrice(25000);
        p1.setMultiTouchScreen(true);
        p1.setHeartRate(125);

        w1.setColor("White");
        w1.setName("Samsung Smart Watch");
        w1.setPrice(12000);
        w1.setMultiTouchScreen(false);
        w1.setHeartRate(125);

        System.out.println("Smart phone");
        System.out.println("Name: "+p1.getName());
        System.out.println("Colour: "+p1.getColor());
        System.out.println("Price: "+p1.getPrice());
        System.out.println("Is multi-touch: "+p1.isMultiTouchScreen());
        System.out.println("Heart Rate: "+p1.getHeartRate());
        System.out.println();

        System.out.println("Smart Watch");
        System.out.println("Name: "+w1.getName());
        System.out.println("Colour: "+w1.getColor());
        System.out.println("Price: "+w1.getPrice());
        System.out.println("Is multi-touch: "+w1.isMultiTouchScreen());
        System.out.println("Heart Rate: "+w1.getHeartRate());
    }
}
