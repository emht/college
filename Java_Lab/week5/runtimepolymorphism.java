/**
* Date: 30/08/17
* Purpose: Demonstrate runtime polymorphism
* Aim: Use a super class variable to reference a sub class object
*/
import java.util.Scanner;

class runtimepolymorphism {
   public static class base {
       void out() {
           System.out.println("Parent Class");
       }
   }
   public static class subclass1 extends base{
       void out() {
           System.out.println("Child Class 1");
       }
   }
   public static class subclass2 extends base {
       void out() {
           System.out.println("Child class 2");
       }
   }
   public static void main(String args[]) {
       base b1 = new subclass1();
       base b2 = new subclass2();
       System.out.println("Initiliasing base class object.");
       b1.out();
       b2.out();
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}