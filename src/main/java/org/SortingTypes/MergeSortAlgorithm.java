package org.SortingTypes;

public class MergeSortAlgorithm implements Sorter{

    public  int[] sortAsc(int[] unsortedArray) {
        return mergeSort(unsortedArray, unsortedArray.length);
    }

    public static int[] mergeSort(int[] arrayelement,int arraysize) {
        if (arraysize < 2) {
            return arrayelement;
        }
        int mid = arraysize / 2;
        int[] l = new int[mid];
        int[] r = new int[arraysize - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arrayelement[i];
        }
        for (int i = mid; i < arraysize; i++) {
            r[i - mid] = arrayelement[i];
        }
        mergeSort(l, mid);
        mergeSort(r, arraysize - mid);

        merge(arrayelement, l, r, mid, arraysize - mid);

        return arrayelement;
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }


}
