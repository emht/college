/**
* Date: 23/08/17
* Purpose: Inputting/initialising circle class
*/
import java.util.Scanner;

class methodOverload {
   public static class ObjectArea {
       float area = 0;
       public void Area(float radius) {
           System.out.println("The Area of the object is: " + 3.14 * radius * radius + ".");
       }
       public void Area(int side) {
           System.out.println("The Area of the object is: " + side * side + ".");
       }
       public void Area(int len, int bre) {
           System.out.println("The Area of the object is: " + len * bre + ".");
       }
   }
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Select the object whose area you want to calculate:");
       System.out.println("1. Circle");
       System.out.println("2. Rectangle");
       System.out.println("3. Square");
       
       int ch = sc.nextInt();
       ObjectArea obj = new ObjectArea();
       switch(ch) {
           case 1:
            System.out.print("Input the radius of circle: ");
            float radius = sc.nextFloat();
            obj.Area(radius);
            break;
           case 2:
            System.out.print("Input the length of the rectangle: ");
            int len = sc.nextInt();
            System.out.print("Input the width of the rectangle: ");
            int breadth = sc.nextInt();
            obj.Area(len, breadth);
            break;
           case 3:
            System.out.print("Input the side of the square: ");
            int side = sc.nextInt();
            obj.Area(side);
            break;
           default:
       }
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}