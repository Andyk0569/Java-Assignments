abstract class Shape {
    public abstract void calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = 3.14 * (radius * radius);
        System.out.println("Area of a Circle is: " + area);
    }
}

class Rectangle extends Shape {
    int width, length;

    Rectangle(int width, int length) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        int area = width * length;
        System.out.println("Area of rectangle is: " + area);
    }

}

public class Abstraction {
    public static void main(String[] args) {

        // Circle circle = new Circle(10.5);
        // Rectangle rectangle = new Rectangle(10, 5);
        // circle.calculateArea();
        // rectangle.calculateArea();

        Shape cicle = new Circle(10.5);
        Shape rectangle = new Rectangle(10, 5);

        cicle.calculateArea();
        rectangle.calculateArea();

    }
}
