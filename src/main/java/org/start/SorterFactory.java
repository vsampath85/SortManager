package org.start;

import org.Exception.SortLoaderException;
import org.SortingTypes.*;

public class SorterFactory {
    public static Sorter getSorter(String sortDesc) throws SortLoaderException {
        if (sortDesc .equalsIgnoreCase("Bubble") ) {
            return new BubbleSortAlgorithm();
        } else if (sortDesc .equalsIgnoreCase("BinaryTree") ) {
            return new BinaryTreeAlgorithm(SortManagerMain.binaryTreeRoute);
        } else if (sortDesc .equalsIgnoreCase( "Merge") ) {
            return new MergeSortAlgorithm();
        } else {
            throw new SortLoaderException("Invalid Sort Algorithum");
        }
    }

    public static String getSorterDesc(int sortChoice) {
        String sortDesc = "";
        if (sortChoice == 1) {
            sortDesc = "Bubble";
        } else if (sortChoice == 2) {
            sortDesc = "BinaryTree";
        } else if (sortChoice == 3) {
            sortDesc = "Merge";
        } else if (sortChoice == 4){
            sortDesc = "Bubble and BinanryTree";
        } else if (sortChoice == 5) {
            sortDesc = "Bubble and Merge";
        } else if (sortChoice == 6){
            sortDesc = "Binary and merge";
        }else if (sortChoice == 7){
            sortDesc = "Bubble,binary and Merge";
        }
        return sortDesc;
    }

}
