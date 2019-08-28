/*
 * Program that takes 2 arrays of characters and returns to the user, an array
 * with the values of the previous 2 arrays alternated.
 *
 * @author Stewart
 * @version JAVA 8, 7/17/2019
 */

import java.util.Arrays;

public class AlternatingArrays {
    public static void main(String[] args){
        /* Test case arrays */
        char[] arr1 = {'1', '2', '3', '4'};
        char[] arr2 = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[] emptyArray = new char[0];

        /* Prints the output of the 'alternateArrays' method */
        System.out.println(Arrays.toString(alternateArrays(arr1, arr2)));
        System.out.println(Arrays.toString(alternateArrays(arr1, emptyArray)));
        

    }
    /*
     * Method: 'alternateArrays'
     * Takes in 2 arrays and returns an array with the values of the 2 arrays alternating
    */
    public static char[] alternateArrays(char[] arr1, char[] arr2){
        /* 
         * Creates 'arrNew' which will contain the alternated array values and
         * sets the size to the size of 'arr1' and 'arr2' combined
         */
        char[] arrNew = new char[arr1.length + arr2.length];

        /* 'j' will track the current filled index of 'arrNew' */
        int j = 0;
        /* 
         * Sense 'arrNew' is the length of both 'arr1' and 'arr2' combined, the
         * for loop only need to loop the size of 'arrNew'
         */
        for(int i = 0; i < arrNew.length; i++){
            /*
             * if 'i' is less than the length of 'arr1', set 'arr1' at index 'i'
             * equal to 'arrNew' at index 'j'.
             * incrament 'j' to show the index has been filled
             */
            if(i < arr1.length){
                arrNew[j] = arr1[i];
                j++;
            }
            /*
             * if 'i' is less than the length of 'arr2', set 'arr1' at index 'i'
             * equal to 'arrNew' at index 'j'.
             * incrament 'j' to show the index has been filled
             */
            if(i < arr2.length){
                arrNew[j] = arr2[i];
                j++;
            }
        }
        return arrNew;
    }
}
