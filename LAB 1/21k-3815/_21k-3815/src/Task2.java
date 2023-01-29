
public class Task2 {
    public static void main(String[] args) {
        int a = max(5,11);
        int b = max(69,79,99);
        System.out.println("Max of 2 int is "+a);
        System.out.println("Max of 3 int is "+b);
    }
    public static int max (int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static int max (int a, int b , int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else {
            return c;
        }
    }
}
