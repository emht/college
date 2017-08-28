/**
* Date: 23/08/17
* Purpose: Simple Inheritance class
*/
import java.util.Scanner;

class personInheritance {
   public static class human {
       void attrib1() {
           System.out.println("All humans are mammals.");
       }
   }
   public static class student extends human{
       void attrib2() {
           System.out.println("All students are human.");
       }
   }
   public static void main(String args[]) {
       student first = new student();
       first.attrib1();
       first.attrib2();      
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}