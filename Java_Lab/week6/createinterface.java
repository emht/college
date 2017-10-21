/**
* Date: 30/08/17
* Purpose: Creates an interface and implements it. 
*/
import java.util.Scanner;

interface MyInterface
{
   public void method1();
   public void method2();
}

class createinterface implements MyInterface {
    public void method1() {
     System.out.println("implementation of method1");
    }
    public void method2() {
     System.out.println("implementation of method2");
    }
   public static void main(String args[]) {
       MyInterface obj = new Demo();
	   obj.method1();
       System.out.println();
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}