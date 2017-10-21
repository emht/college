/**
* Date: 30/08/17
* Purpose: Demonstrate an application that displays deadlock between threads.
*/
import java.util.Scanner;

class deadlock_thread {
    String str1 = "Java";
    String str2 = "Linux";

    Thread t1 = new Thread("My thread 1") {
        public void run() {
            while(true) {
                synchronized(str1) {
                    synchronized(str2) {
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    };

    Thread t2 = new Thread("My thread 2") {
        public void run() {
            while(true) {
                synchronized(str2) {
                    synchronized(str1) {
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };
    public static void main(String args[]) {
        deadlock_thread one = new deadlock_thread();
        one.t1.start();
        one.t2.start();
        System.out.println();
        System.out.println("Made by: Mohit Bansal(05414802715)\n");        
    }
}