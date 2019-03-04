package rocks.zipcode.assessment2.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        if(startingIndex < 0){
            throw new IllegalArgumentException();
        }
        String thrower = arrayToBeSpliced[startingIndex];


            String[] subArray = new String[endingIndex - startingIndex];
            int j = 0;
            for (int i = 0; i < arrayToBeSpliced.length; i++) {
                if(i>= startingIndex && i< endingIndex){
                    subArray[j] = arrayToBeSpliced[i];
                    j++;
                }
            }
            return subArray;





    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {


        return Arrays.copyOfRange(arrayToBeSpliced,startingIndex,arrayToBeSpliced.length);
    }
}
