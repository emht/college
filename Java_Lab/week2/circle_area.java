/**
 * Date: 16/08/17
 * Purpose: Calculates the area of circle using passed radius 
 */
class circle_area {
    public static void main(String args[]) {
        if (args.length == 1) {
           int radius = Integer.parseInt(args[0]);
           System.out.println("Area of circle with radius " + radius + " is: " + 3.14 * radius * radius + ".");
        }
        System.out.println("Made by: Mohit Bansal(05414802715)\n");        
    }
}