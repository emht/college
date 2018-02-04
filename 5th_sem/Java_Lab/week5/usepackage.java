/**
* Date: 30/08/17
* Purpose: Demonstrate application that uses the package p1 created in the previous program.
*/
import pkg.*;

class usepackage {
   public static void main(String args[]) {
       createpackage first = new createpackage();
       System.out.println(first.add(100, 200));
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}