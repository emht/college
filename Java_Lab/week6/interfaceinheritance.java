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

class interfaceinheritance implements showable{
   public void print() {
       System.out.println("Hello");
   }
   public void print() {
       System.out.println("Welcome");
    }
   public static void main(String args[]) {
       TestInterface obj = new TestInterface();  
       obj.print();
       obj.show();
       System.out.println();
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}