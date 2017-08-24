/**
 * Date: 23/08/17
 * Purpose: Demonstrate the use of "this" keyword
 */
import java.util.Scanner;

class thisKeyword {
    public static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }        
        public void getOutput() {
            System.out.println("The name of student is: " + this.name + ".");
            System.out.println("The age of student is: " + this.age + ".");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the Name and Age of the student: ");
        System.out.print("Name: ");
        String stu_name = sc.nextLine();
        System.out.print("Age: ");
        int stu_age = sc.nextInt();

        Student one = new Student(stu_name, stu_age);
        one.getOutput();

        System.out.println("Made by: Mohit Bansal(05414802715)\n");  
        sc.close();      
    }
}