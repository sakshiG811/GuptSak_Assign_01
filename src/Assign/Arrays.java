package Assign;

import java.io.IOException;

public class Arrays {
    /**
     * Equal Function
     * @param arr1 Determine if two arrays are equal.
     */
    public static boolean areEqual(int arr1[], int arr2[]) {        /** Function to check if two are equal or not */

        System.out.println("Are both arrays equal?");               /** Prints the question */
        int n = arr1.length;
        int m = arr2.length;

        if (n != m)
            return false;                                           /** if the length of both arrays are not equal, return false */

        for (int i = 0; i < n; i++)
            if (arr1[i] != arr2[i])                                 /** if both arrays are not equal, return false */
                return false;
        return true;
    }
    /**
     * Hamming Distance
     * @param arr3 Determine the hamming distance of two arrays.
     */
    public static int HammingDist(int arr3[], int arr4[]) {         /** Function to determine the hamming distance. */
    assert(arr3 != null && arr4 != null && arr3.length == arr4.length) :
            "Precondition for Hamming Distance is violated!";       /** Prints the statement if condition not met */
     int arrayLength = arr3.length;
     int HamDist = 0;
     for(int i = 0; i < arrayLength; i++){
         if(arr3[i] != arr4[i]){
             HamDist ++;

         }
     }
     return HamDist;
    }
    /**
     * Binary search
     * @param arr5 Perform binary search.
     */
    public static void BinarySearch(int arr5[], int first, int last, int key){  /** Function to perform Binary Search */
        int mid = (first + last)/2;
        while( first <= last){
            if(arr5[mid] < key){
                first = mid + 1;
            }
            else if(arr5[mid] == key){
                System.out.println("Binary Search: Value found at index: " + mid); /** Prints the output statement */
                break;
            }
            else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if( first > last){
            System.out.println("Binary Search: Value not found!");                 /** Prints the output statement */
        }
    }
    /**
     * Main Function
     * @param args The command line arguments.
     */
    public static void main(String[] args)
            throws IOException {
        int arr1[] = {5, 6, 7, 8};
        int arr2[] = {9, 0, 3, 8};

        if (areEqual(arr1, arr2))
            System.out.println("Yes, both are equal!");             /** if both arrays are equal, print YES */
        else
            System.out.println("No, both are not equal!");          /** if both arrays are not equal, print NO */


            int[] a = {1, 2, 3, 4, 5};
            System.out.println("The half-copied array: ");          /** Function to copy half array to new one */
           if(a == null || a.length == 0){
               System.out.println("The array is empty!");           /** Prints the output statement */
           }
           else{
               int b[] = new int[1 + a.length/2];
               int k =0;
               for(int i =0; i < a.length; i += 2){
                   b[k++] = a[i];
               }
               for(int i = 0; i < k; i++){

                   System.out.print( b[i] + " ");
               }
           }


                int c[] [] ={                                       /** Function to show sum of rows and columns of a matrix */
                        {2, 4, 6},
                        {2, 1, 0},
                        {1, 2, 3} };

                int rows = c.length;
                int columns = c[0].length;
                System.out.println("");
                for(int i = 0; i< rows; i++){
                    int RowSum = 0;
                    for(int j =0; j < columns; j++){
                        RowSum = RowSum +c[i][j];
                    }
                    System.out.println("Sum of " + (i+1) + " row: " + RowSum);  /** Prints the results */
                }

                for (int i =0; i < columns; i++){
                    int ColSum = 0;
                    for(int j = 0; j < rows; j++){
                        ColSum = ColSum + c[j][i];
                    }
                    System.out.println("Sum of " + (i + 1) + " column: " + ColSum); /** Prints the results */
                }

                int arr3[] = {1, 2, 3, 4 };                         /** Function to perform Hamming Distance */
                int arr4[] = {1, 2, 5, 6 };
                System.out.println("Result of Hamming Distance: " + HammingDist(arr3, arr4)); /** Prints the results */
                if(HammingDist(arr3, arr4) == 2)
                    System.out.println("Passed!");                              /** Prints the output statement */
                else
                    System.out.println("Failed!");                              /** Prints the output statement */


            int arr5[] = {2, 4, 6, 8, 10, 12, 14};                  /** Function to perform Binary Search */
            int key = 11;
            int last = arr5.length - 1;
            BinarySearch(arr5, 0, last, key);
    }


}
