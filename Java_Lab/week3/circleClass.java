/**
 * Date: 23/08/17
 * Purpose: Checks whether the input number is odd or even
 */
import java.util.Scanner;

class circleClass {
    Scanner sc = new Scanner(System.in);
    public static class Circle {
        int center, radius;
        public void getInput(int cen, int rad) {
            center = cen;
            radius = rad;
        }

        public void getOutput() {
            System.out.println("The Center of the circle is: " + this.center + ".");
            System.out.println("The Radius of the circle is: " + this.radius + ".");
        }
    }
    public static void main(String args[]) {
        System.out.println("Input the Center and Radius of the circle.");
        System.out.print("Center: ");
        int cen = sc.nextInt();
        System.out.print("Radius: ");
        int rad = sc.nextInt();
        System.out.println("Made by: Mohit Bansal(05414802715)\n");        
    }