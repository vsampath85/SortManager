package org.start;

import org.Exception.SortLoaderException;
import org.Helper.Helper;
import org.SortingTypes.Sorter;
import org.junit.jupiter.api.*;
import org.start.SorterFactory;

import java.util.Random;

public class Performancetest {
    static int[] unsortedArray;
    static int[] sortedArray;

@BeforeAll
static void setup() {
    unsortedArray = new int[100];

    Random random = new Random();
    for (int i = 0 ; i < 100 ; i++) {
        unsortedArray[i] = random.nextInt(1000)+1;
    }
}
    @Test
    @DisplayName("Check the sorterchoice is 1")
    void perfTestBubblesort()  {
        Sorter sort = null;
        try {
            sort = SorterFactory.getSorter("Bubble");
        } catch (SortLoaderException e) {
            throw new RuntimeException(e.getMessage());
        }
        long stTime = Helper.getNanotime();
        sort.sortAsc(unsortedArray);
        long entime = Helper.getNanotime();
        long elapsedtime = entime - stTime;
        System.out.println();
        System.out.println("Time taken to sort the array by Bubble Algorithm : "+ elapsedtime +" nano seconds");
    }

    @Test
    @DisplayName("Check the sorterchoice is 2")
    void perfTestBinarysort() {
        Sorter sort = null;
        try {
            sort = SorterFactory.getSorter("BinaryTree");
        } catch (SortLoaderException e) {
            throw new RuntimeException(e.getMessage());
        }
        long stTime = Helper.getNanotime();
        sort.sortAsc(unsortedArray);
        long entime = Helper.getNanotime();
        long elapsedtime = entime - stTime;
        System.out.println("Time taken to sort the array by BinaryTree Algorithm : "+ elapsedtime +" nano seconds");
    }

    @Test
    @DisplayName("Check the sorterchoice is 1")
    void perfTestMergesort()  {
        Sorter sort = null;
        try {
            sort = SorterFactory.getSorter("Merge");
        } catch (SortLoaderException e) {
            throw new RuntimeException(e.getMessage());
        }
        long stTime = Helper.getNanotime();
        sort.sortAsc(unsortedArray);
        long entime = Helper.getNanotime();
        long elapsedtime = entime - stTime;
        System.out.println("Time taken to sort the array by MergeSort Algorithm : "+ elapsedtime +" nano seconds");
    }
}
