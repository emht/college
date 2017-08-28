/**
* Date: 23/08/17
* Purpose: Pass the object as an argument
*/
import java.util.Scanner;

class objectPassing {
   public static class Circle {
       int radius;
       public void getInput(int rad) {
           radius = rad;
       }
   }

   static void area(Circle one) {
       System.out.println("The area of the inputted circle is " + one.radius * one.radius * 3.14 + ".");
   }
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Input the Radius of the circle.");
       System.out.print("Radius: ");
       int rad = sc.nextInt();

       Circle one = new Circle();
       one.getInput(rad);
       area(one);

       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}