/**
* Date: 30/08/17
* Purpose: Demonstrate application that creates a package p1.
* Add some classes in it. 
*/
package pkg;
import java.util.Scanner;

public class createpackage {
   public int add(int a, int b) {
       return a + b;
   }
   public static void main(String args[]) {
       createpackage first = new createpackage();
       System.out.println(first.add(10, 20));
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}