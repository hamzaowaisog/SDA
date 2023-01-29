
class shape{
    int a , b;
    int area;
    shape(int x, int y){
        a = x;
        b = y;
    }
    void calArea() {
        area = a * b ;
        System.out.println("area is : "+area);
    }
}
public class ClassExample {
    public static void main(String[]
                                    args) {
// SDA-LAB ""
        shape s1 = new shape(2, 2);
        s1.calArea();
    }}