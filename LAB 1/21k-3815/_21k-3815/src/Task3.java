import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        OrderCake o1 = new OrderCake();
        ReadymadeCake r1 = new ReadymadeCake();
        int p1 =o1.CalculatePrice();
        System.out.println("Price of Order cake "+p1);
        System.out.println();
        p1 =r1.CalculatePrice();
        System.out.println("Price of Ready made cake "+p1);



    }
}
abstract class Cake{
     abstract int Quantity();
     abstract int CalculatePrice();
}
class OrderCake extends Cake{
    @Override
    public int Quantity() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Quantity");
        return sc.nextInt();
    }

    @Override
    public int CalculatePrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of the cake");
        int weight = sc.nextInt();
        int price = weight*800*Quantity();
        return price;
    }
}
class ReadymadeCake extends Cake{
    @Override
    public int Quantity() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Quantity");
        return sc.nextInt();
    }

    @Override
    public int CalculatePrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of the cake");
        int weight = sc.nextInt();
        int price = weight*500*Quantity();
        return price;
    }
}
