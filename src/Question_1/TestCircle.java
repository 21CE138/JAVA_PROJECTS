package Question_1;
import java.util.*;
public class TestCircle {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter The radius of Circle");
        double radius = sc.nextInt();
        Circle c = new Circle();
        Circle c1 = new Circle(radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}
