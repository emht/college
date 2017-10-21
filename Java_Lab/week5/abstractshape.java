/**
* Date: 30/08/17
* Purpose: Demonstrate abstract class shape
*/
import java.util.Scanner;

class abstractshape {
   public abstract class shape {
       void draw() {}
   }
   public static class rectangle extends shape{
       void draw() {
           System.out.println("Child Class");
       }
   }
   public static class triangle extends shape {

   }
   public static void main(String args[]) {
       student first = new student();
       first.out();      
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}