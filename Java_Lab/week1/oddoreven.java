import java.util.Scanner;

class oddoreven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Input second Number: ");
        int num2 = sc.nextInt();
        if(num1 % 2 == 0) System.out.println(num1 + " is an even number.");
        else System.out.println(num1 + " is an odd number.");

        if(num2 % 2 == 0) System.out.println(num2 + " is an even number.");
        else System.out.println(num2 + " is an odd number.");
        
        System.out.println("Made by: Mohit Bansal(05414802715)\n");        
    }
}