/**
* Date: 30/08/17
* Purpose: Demonstrate interface inheritance
*/
import java.util.Scanner;

interface Printable {
    void print();  
}  
interface Showable extends Printable {
    void show();
}

class interfaceinheritance implements Showable{
   public void print() {
       System.out.println("In Print(): Hello");
   }
   public void show() {
       System.out.println("In Show(): Welcome");
    }
   public static void main(String args[]) {
       interfaceinheritance obj = new interfaceinheritance();
       obj.print();
       obj.show();
       System.out.println();
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}