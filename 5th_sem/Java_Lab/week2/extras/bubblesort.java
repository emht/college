/**
 * Date: 16/08/17
 * Purpose: Sorts a set of randomly arranged numbers using bubble sort
 */
import java.util.*;

 class bubblesort {
     public static class Sort {
         private int input[], len;
         Sort() {

         }
         public void bubble() {
            int temp = 0;
            for(int pre_index = 0; pre_index < len; pre_index++) {
                for( int post_index = 1; post_index < (len); post_index++) {
                    if(input[post_index - 1] > input[post_index]) {
                        temp = input[post_index - 1];  
                        input[post_index - 1] = input[post_index];  
                        input[post_index] = temp;  
                    }
                }
            }
        }

         public void getInput(int[] arr, int size) {
             input = arr;
             len = size;
         }
     }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program sorts randomly arranged number via bubble sort!");
        System.out.println("Input the number of elements you need to be sorted:");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Inputting the elements that need to be sorted!
        System.out.println("Please enter space separated integers: ");
        for(int iter = 0; iter < size; iter++) {
            numbers[iter] = sc.nextInt();
        }
        
        Sort array1 = new Sort();
        array1.getInput(numbers, size);
        System.out.print("Elements you entered: ");
        
        //prints inputted array
        for(int i:numbers) {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        // Sorting the array selectively
        array1.bubble();

        //printing the sorted array
        System.out.print("Elements after Sorting: ");
        for(int i:numbers) {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        System.out.println("Made by: Mohit Bansal(05414802715)\n");                
        sc.close();
    }
}