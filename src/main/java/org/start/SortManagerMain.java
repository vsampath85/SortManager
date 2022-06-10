package org.start;

import org.Exception.SortLoaderException;
import org.Helper.Helper;

public class SortManagerMain {

    static SortLoader sortLoader;
    static DisplayManager displayManager;
    static SortController sortController;
    static int[] unsortedArray;
    static int sortOption = -1;
    static int arraySize = 0;

    static final int binaryTreeRoute = 50;

    public static void main(String[] args) {

        sortLoader = getUserInput();

        while (sortOption != 0 && arraySize > 0) {

            displayManager = new DisplayManager();
            sortController = new SortController(sortLoader, displayManager);

            unsortedArray = Helper.generateRandIntArray(sortController.getArraysize());

            if ( sortOption == 1 || sortOption == 4 || sortOption == 5 || sortOption == 7) {
                int[] arraytosort = new int[arraySize];
                for (int i = 0 ; i < arraySize ; i++) {
                    arraytosort[i] = unsortedArray[i];
                }
                sortController.setSortDesc(1);
                sortRun(arraytosort);
            }

            if (sortOption == 2 || sortOption == 4 || sortOption == 6 || sortOption == 7) {
                int[] arraytosort = new int[arraySize];
                for (int i = 0 ; i < arraySize ; i++) {
                    arraytosort[i] = unsortedArray[i];
                }
                sortController.setSortDesc(2);
                sortRun(arraytosort);
            }

            if (sortOption == 3 || sortOption == 5 || sortOption == 6 || sortOption == 7) {
                int[] arraytosort = new int[arraySize];
                for (int i = 0 ; i < arraySize ; i++) {
                    arraytosort[i] = unsortedArray[i];
                }
                sortController.setSortDesc(3);
                sortRun(arraytosort);
            }
            sortLoader = getUserInput();
        }
    }

    private static SortLoader getUserInput() {
        SortLoader sortLoader;
        arraySize = 0;
        sortOption = Helper.getSortOption();
        if (sortOption !=0) {
            arraySize = Helper.getArryaSize();
            if (arraySize > 0) {
                sortLoader = new SortLoader();
                sortLoader.setSortDesc(sortOption);
                sortLoader.setArraysize(arraySize);
                return sortLoader;
            }
        }
        return null;
    }

    private static void sortRun(int[] arraytosort) {
        try {
            sortController.setSortAlgorithm();
        } catch (SortLoaderException e) {
            throw new RuntimeException(e.getMessage());
        }

        long stTime = Helper.getNanotime();
        sortController.runSorter(arraytosort);
        long enTime = Helper.getNanotime();

        sortController.setElapsedtime(enTime-stTime);
        sortController.display();
    }
}


