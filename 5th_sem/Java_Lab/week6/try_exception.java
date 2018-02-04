/**
* Date: 30/08/17
* Purpose: Demonstrate try, catch, throws and finally.
*/
import java.util.Scanner;

class try_exception {
    static void check() throws ArithmeticException {
     System.out.println("Inside check function");
     throw new ArithmeticException("demo");
    }
    
    public static void main(String args[]) {
        try {
         check();
        }
        catch(ArithmeticException e) {
         System.out.println("caught" + e);
        }
        finally {
         System.out.println("finally is always executed.");
        }
        
        System.out.println();
        System.out.println("Made by: Mohit Bansal(05414802715)\n");        
    }
}