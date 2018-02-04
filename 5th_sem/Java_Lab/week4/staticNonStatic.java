/**
* Date: 23/08/17
* Purpose: To show that the value of non static variable is not visible to all the instances
*          therefore cannot be used to count the number of instances
*/
import java.util.Scanner;

class staticNonStatic {
   public static class class1 {
       static int static_count = 0;
       int non_static_count = 0;
       
       class1() {
           static_count++;
           non_static_count++;
           System.out.println("Value of static counter for this object is: " + static_count + ".");
           System.out.println("Value of Non Static counter for this object is: " + non_static_count + ".");
           System.out.println("");
       }
   }
   public static void main(String args[]) {
       class1 obj1 = new class1();
       class1 obj2 = new class1();
       class1 obj3 = new class1();

       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}