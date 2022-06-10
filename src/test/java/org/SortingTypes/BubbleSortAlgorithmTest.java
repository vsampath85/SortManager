package org.SortingTypes;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;


public class BubbleSortAlgorithmTest {
    BubbleSortAlgorithm bubble = new BubbleSortAlgorithm();

    @Test
    @DisplayName("check that the given number is sorted with 2 array size")
    public void checksort() {
        Assertions.assertArrayEquals((new int[]{1, 34}), bubble.sortAsc(new int[]{34, 1}));
    }

    @Test
    @DisplayName("check that the given number is sorted with 4 array size")
    public void checkTotal() {
        Assertions.assertArrayEquals((new int[]{2, 34, 67, 89}), bubble.sortAsc(new int[]{67, 89, 34, 2}));
    }

    @Test
    @DisplayName("check that the given number is sorted")
    public void checknegative() {
        Assertions.assertArrayEquals((new int[]{-89, -67, -34, -2}), bubble.sortAsc(new int[]{-67, -89, -34, -2}));
    }


    @Test
    @DisplayName("check that the given number is sorted with positive and negative ")
    public void checkbothpossitiveandnegative() {
        Assertions.assertArrayEquals((new int[]{-34, 1, 56}), bubble.sortAsc(new int[]{56, 1, -34}));
    }

    @Test
    @DisplayName("check that the given number is sorted using positive numbers")
    public void checkbothpossitiverange() {
        Assertions.assertArrayEquals((new int[]{0, 1}), bubble.sortAsc(new int[]{1, 0}));
    }

    @Test
    @DisplayName("check that the given number is sorted")
    public void checkwithnullvalues() {
        Assertions.assertArrayEquals((new int[]{}), bubble.sortAsc(new int[]{}));
    }

}
