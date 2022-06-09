package org.SortMgr;

import org.Helper.Helper;
import org.SortingTypes.BubbleSortAlgorithm;
import org.SortingTypes.MergeSortAlgorithm;

public class SortManager {
    public static void main(String[] args) {
        int sortChoice = 0;
        int arraySize = 1;
        int [] unsortArray;
        int [] sortedArray;
        String ArrayItems = "";

        String usrQuestion = "";
        Helper helper = new Helper();

        sortChoice = helper.getSortOption();
        if (sortChoice != 0) {
            arraySize = helper.getArryaSize();

            if (arraySize > 0) {
                unsortArray = new int[arraySize];
                sortedArray = new int[arraySize];
                unsortArray = helper.generateRandIntArray(arraySize);

                System.out.println("Unsorted Array : "+helper.convertIntArraytoString(unsortArray));

                //long start = System.nanoTime();

                if (sortChoice == 1) {
                    System.out.println("Sort Algorithm : Bubble Sort");
                    sortedArray = BubbleSortAlgorithm.bubbleSort(unsortArray);
                } else if (sortChoice == 3) {
                    System.out.println("Sort Algorithm : Merge Sort");
                    sortedArray = MergeSortAlgorithm.mergeSort(unsortArray,arraySize);
                } else if (sortChoice == 2) {
                    System.out.println("Not implemented in PHASE 1");
                }

                //long finish = System.nanoTime();
                //long timeElapsed = finish - start;

                System.out.println("Sorted Array : "+helper.convertIntArraytoString(sortedArray));
                //System.out.println("Time taken for the sorting : "+timeElapsed + " nano seconds");

            }
        }



    }
}
