/**
* Date: 30/08/17
* Purpose: Demonstrate abstract class shape
*/
abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}
class Rectangle extends Shape {
    private final double width, length;

    public Rectangle() {
        this(1,1);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return 2 * (width + length);
    }
}
class Triangle extends Shape {
    private final double a, b, c; 
    public Triangle() {
        this(1,1,1);
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        return a + b + c;
    }
}
public class abstractshape {
    public static void main(String[] args) {
        double width = 2, length = 5;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

        double a = 8, b = 6, c = 2;
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.area()
                + "\nResulting Perimeter: " + triangle.perimeter() + "\n");
        
        System.out.println();
    System.out.println("MOhit Bansal(05414802715)\n");
    }

}