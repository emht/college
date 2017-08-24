/**
 * Date: 23/08/17
 * Purpose: Initialise a circle class using constructor
 */
import java.util.Scanner;

class countInstances {
    public static class Circle {
        int center, radius;

        Circle(int cen, int rad) {
            center = cen;
            radius = rad;
        }        
        public void getOutput() {
            System.out.println("The Center of the circle is: " + this.center + ".");
            System.out.println("The Radius of the circle is: " + this.radius + ".");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Center and Radius of the circle.");
        System.out.print("Center: ");
        int cen = sc.nextInt();
        System.out.print("Radius: ");
        int rad = sc.nextInt();

        Circle one = new Circle(cen, rad);
        one.getOutput();

        System.out.println("Made by: Mohit Bansal(05414802715)\n");        
    }
}