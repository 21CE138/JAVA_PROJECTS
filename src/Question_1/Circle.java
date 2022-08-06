package Question_1;

public class Circle {
    public double radius = 1;
    Circle() {
        System.out.println("Default Radius :- " + radius);
    }
    Circle(double radius) {
        this.radius=radius;
        System.out.println("Radius of circle :- " + radius);
    }

    public double getArea() {
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
}
