
/**
 * Date: 16/08/17
 * Purpose: Sorts a set of randomly arranged numbers using selection sort
 */
 import java.util.*;

 class selectionsort {
     public static class Sort {
         private int input[], len;
         Sort() {

         }
         public void selection() {
            for(int elem_index = 0; elem_index < len; elem_index++) {
                int index = elem_index;
                for(int elem_new = elem_index + 1; elem_new < len; elem_new++) {
                    if(input[elem_new] < input[elem_index]) {
                        index = elem_new;
                    }
                }
                int smallest = input[index];
                input[index] = input[elem_index];
                input[elem_index] = smallest;
            }
         }

         public void getInput(int[] arr, int size) {
             input = arr;
             len = size;
         }
     }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program sorts randomly arranged number via selection sort!");
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
        array1.selection();

        //printing the sorted array
        System.out.print("Elements after Sorting: ");
        for(int i:numbers) {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        System.out.println("Made by: Mohit Bansal(05414802715)\n");                
    }
}