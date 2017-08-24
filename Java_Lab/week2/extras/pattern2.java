/**
 * Date: 16/08/17
 * Purpose: Displays the following pattern
 *      1
 *     2 3
 *    4 5 6
 */
import java.util.*;
class pattern2 {
    public static class pattern {
        private int height;
        pattern() {

        }
        public void getHeight(int num) {
            height = num;
        }

        public void draw() {
            int counter = 1;
            for(int i = 0; i <= height; i++) {
                for(int j = i+1; j <= height; j++) {
                    System.out.print(" ");
                }
                for(int k = 0; k < i; k++) {
                    System.out.print(counter + " ");
                    counter++;
                }
                System.out.println("");
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program is Egyptian, it will build a pyramid");
        System.out.print("Please input how high you wanna be: ");
        int high = sc.nextInt();

        pattern first = new pattern();
        first.getHeight(high);
        first.draw();

        System.out.println("Made by: Mohit Bansal(05414802715)\n");   
        sc.close();             
    }
}