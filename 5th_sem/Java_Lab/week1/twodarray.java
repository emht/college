/**
 * Date: 09/08/17
 * Purpose: Demonstrates the multidimensional array
 */

class twodarray {
    public static void main(String args[]) {
        int arr[][];
        arr = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];

        arr[0][0] = 32;
        arr[1][0] = 500; arr[1][1] = 300;
        arr[2][0] = 39; arr[2][1] = 45; arr[2][2] = 600;

        for(int iter = 0; iter < 3; iter++) {
            System.out.println("Size of arr[" + iter + "] is " + arr[iter].length);
            System.out.print("Elements: ");
            for (int elem = 0; elem < arr[iter].length; elem++) {
                System.out.print(arr[iter][elem] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Made by: Mohit Bansal(05414802715)\n");        
    }
}