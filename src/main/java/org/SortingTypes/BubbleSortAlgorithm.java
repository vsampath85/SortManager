package org.SortingTypes;

public class BubbleSortAlgorithm implements Sorter{

    @Override
    public  int[] sortAsc(int[] bubblenumbers) {
        int n = bubblenumbers.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (bubblenumbers[j - 1] > bubblenumbers[j]) {
                    temp = bubblenumbers[j - 1];
                    bubblenumbers[j - 1] = bubblenumbers[j];
                    bubblenumbers[j] = temp;
                }
            }
        } return bubblenumbers;
    }

}
