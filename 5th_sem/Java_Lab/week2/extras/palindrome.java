/**
 * Date: 16/08/17
 * Purpose: Checks whether the input is palindromic in nature or not
 */
import java.util.*;
class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reversed = "";
        int length = input.length();
        for(int iter = length - 1; iter >= 0; iter--) {
            reversed = reversed + input.charAt(iter);
        }

        if(input.equals(reversed)) {
            System.out.println("God had mercy on you!");
        }
        else
            System.out.println("You stepped in wrong place!");
        System.out.println("Made by: Mohit Bansal(05414802715)\n");                
    }
}