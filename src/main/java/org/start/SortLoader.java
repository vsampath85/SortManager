package org.start;

import org.Exception.SortLoaderException;
import org.SortingTypes.Sorter;

public class SortLoader {

    private int arraysize;
    private String sortDesc;
    private Sorter sortAlgorithm;
    private long elapsedtime;
    private String unsortedArrayItems;
    private String sortedArrayItems;

    public String getSortDesc() {
        return sortDesc;
    }

    public void setSortDesc(int sortChoice) {
        this.sortDesc=SorterFactory.getSorterDesc(sortChoice);
    }

    public void setSortAlgorithm() throws SortLoaderException {
        this.sortAlgorithm = SorterFactory.getSorter(this.sortDesc);
    }

    public int getArraysize() {
        return arraysize;
    }

    public void setArraysize(int arraysize) {
        this.arraysize = arraysize;
    }

    public long getElapsedtime() {
        return elapsedtime;
    }

    public void setElapsedtime(long elapsedtime) {
        this.elapsedtime = elapsedtime;
    }

     int[] runSorter(int [] unSortedArray) {
        return sortAlgorithm.sortAsc(unSortedArray);
    }

    public String getUnsortedArrayItems() {
        return unsortedArrayItems;
    }

    public void setUnsortedArrayItems(int[] unsortedArray) {
        this.unsortedArrayItems = convertIntArraytoString(unsortedArray);
    }

    public String getSortedArrayItems() {
        return sortedArrayItems;
    }

    public void setSortedArrayItems(int[] sortedArray) {
        this.sortedArrayItems = convertIntArraytoString(sortedArray);
    }

    String convertIntArraytoString(int [] inputArray) {
        String ArrayItems="";
        for (int elem : inputArray) {
            ArrayItems +=  elem + " ";
        }
        return ArrayItems;
    }

 }
