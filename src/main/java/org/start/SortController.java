package org.start;

import org.Exception.SortLoaderException;
import org.Helper.Helper;
import Loggings.Logging;

import java.util.logging.Logger;

public class SortController {

    private SortLoader sortLoader;
    private DisplayManager displayManager;
    private Logging logging;
    private static final Logger logger = Logger.getLogger("SortManagerLog");

    public SortController(SortLoader sortLoader, DisplayManager displayManager) {
        this.sortLoader = sortLoader;
        this.displayManager = displayManager;
        this.logging = new Logging();
        Helper.logfile(logger);
    }

    public void setSortDesc(int sortChoice) {
        sortLoader.setSortDesc(sortChoice);
    }

    public void setSortAlgorithm() throws SortLoaderException {
        sortLoader.setSortAlgorithm();
    }

    public int getArraysize() {
        return sortLoader.getArraysize();
    }

    public String getSortDesc() {
        return sortLoader.getSortDesc();
    }

    public long getElapsedtime() {
        return sortLoader.getElapsedtime();
    }

    public void setElapsedtime(long elapsedtime) {
        sortLoader.setElapsedtime(elapsedtime);
    }

    public void runSorter(int[] unSortedArray) {
        setUnsortedArrayItems(unSortedArray);
        int[] sortedArray =sortLoader.runSorter(unSortedArray);
        setSortedArrayItems(sortedArray);
    }

    public void display() {
        String unsortedArraylist = getUnsortedArrayItems();
        String sortedArraylist = getSortedArrayItems();
        String sortDesc = getSortDesc();
        long elapsedTime = getElapsedtime();
        displayManager.display(unsortedArraylist, sortedArraylist, sortDesc, elapsedTime);
    }

    public String getUnsortedArrayItems() {
        return sortLoader.getUnsortedArrayItems();
    }

    public void setUnsortedArrayItems(int[] unsortedArray) {
        sortLoader.setUnsortedArrayItems(unsortedArray);
    }

    public String getSortedArrayItems() {
        return sortLoader.getSortedArrayItems();
    }

    public void setSortedArrayItems(int[] sortedArray) {
        sortLoader.setSortedArrayItems(sortedArray);
    }
}

