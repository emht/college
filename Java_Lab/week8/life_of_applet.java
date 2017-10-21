/**
* Date: 30/08/17
* Purpose: Demonstrate runtime polymorphism
*/
import java.util.Scanner;

class runtimepolymorphism {
   public static class human {
       void out() {
           System.out.println("Parent Class");
       }
   }
   public static class student extends human{
       void out() {
           System.out.println("Child Class");
       }
   }
   public static void main(String args[]) {
       student first = new student();
       first.out();      
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}