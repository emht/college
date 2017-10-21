/**
* Date: 30/08/17
* Purpose: Demonstrate an application that shows thread priorities.
*/
import java.util.Scanner;

class thread_priority extends Thread {
   public void run() {
       System.out.println("running thread name: " + Thread.currentThread().getName());
       System.out.println("running thread Priority: " + Thread.currentThread().getPriority());
   }
   public static void main(String args[]) {
       thread_priority m1 = new thread_priority();
       thread_priority m2 = new thread_priority();
       m1.setPriority(Thread.MIN_PRIORITY);
       m2.setPriority(Thread.MAX_PRIORITY);
       m1.start();
       m2.start();
       System.out.println();
       System.out.println("Made by: Mohit Bansal(05414802715)\n");        
   }
}