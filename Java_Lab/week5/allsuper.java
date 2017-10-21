/**
* Date: 30/08/17
* Purpose: Demonstrate all the three uses of super keyword.
* 1. Using super to call superclass constructors
* 2. To access the member variable or functions using super.member
*/
import java.util.Scanner;

class allsuper {
   public static class parent {
       protected int count_parent = 0;
       parent() {
           System.out.println("Parent object is created");
       }
       void out() {
           System.out.println("Parent class count: " + count_parent);
       }
   }
   public static class child extends parent{
       child() {
           // Calling parent clas constructor
           super();
           System.out.println("Child class object is created");
       }
       void parent_method() {
           System.out.println("\ncalling parent class method from child class object");
           super.out();
       }
       void get_super_instance() {
           System.out.println("\nParent count variable is: " + super.count_parent);
       }
   }
   public static void main(String args[]) {
       child one = new child();
       one.parent_method();
       one.get_super_instance();
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}