/**
* Date: 30/08/17
* Purpose: Demonstrate user-defined exception.
*/
import java.util.Scanner;

class MyException extends Exception {
    String str1;
    MyException(String str2) {
        str1 = str2;
    }

    public String toString() {
        return ("MyException Occurred: " + str1);
    }
}

class user_exception {
   public static void main(String args[]) {
       try {
           System.out.println("Starting try block");
           throw new MyException("This is a user-defined exception");
       }
       catch(MyException exp) {
           System.out.println("Catch Block");
           System.out.println(exp);
       }
       System.out.println();
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}