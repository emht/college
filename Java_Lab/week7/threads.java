/**
* Date: 30/08/17
* Purpose: Demonstrate application that executes two threads.
* One thread displays ―A every 1000 milliseconds and other displays ―B every 3000 milliseconds.
* Create the threads by extending the Thread class.
*/
import java.util.Scanner;
import static java.lang.Thread.sleep;

class A extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("A");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e) { }
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("B");
            try{
                Thread.sleep(3000);
            }
            catch(Exception e) { }
        }
        System.out.println("Exit from B");
        Sytem.out.println();
    }
}
class threads {
   public static void main(String args[]) {
       new A().start();
       new B().start();    
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}