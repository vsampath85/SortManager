package org.start;

public class DisplayManager {

    public void display(String unsortedarray, String sortedarray, String sortedmethod, long timeElapsed) {

        System.out.println("*******************************************************************");
        System.out.println("Sort Result for Sort Algorithm : "+ sortedmethod);
        System.out.println("*******************************************************************");
        System.out.println("Unsorted Array : " + unsortedarray);
        System.out.println("Sorted Array : " + sortedarray);
        System.out.println("*******************************************************************");
        System.out.println("Time taken for the sorting : " + timeElapsed + " nano seconds");
        System.out.println("*******************************************************************");
        System.out.println("");
    }

}