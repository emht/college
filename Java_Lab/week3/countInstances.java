/**
 * Date: 23/08/17
 * Purpose: Counts the number of instances instantiated of a class
 */
class countInstances {
    public static class count {
        static int counter = 0;
        count() {
            counter++;
        }        
        public void getOutput() {
            System.out.println("The Count of this class object has reached to: " + counter + ".");
        }
    }
    public static void main(String args[]) {
        System.out.println("This program will count the number of instances created by a class.");
        System.out.println("");

        count one = new count();
        one.getOutput();
        count two = new count();
        two.getOutput();
        count three = new count();
        three.getOutput();

        System.out.println("Made by: Mohit Bansal(05414802715)\n");        
    }
}