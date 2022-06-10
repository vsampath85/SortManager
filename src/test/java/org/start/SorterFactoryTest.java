package org.start;

import org.Exception.SortLoaderException;
import org.SortingTypes.BinaryTreeAlgorithm;
import org.SortingTypes.BubbleSortAlgorithm;
import org.SortingTypes.MergeSortAlgorithm;
import org.SortingTypes.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterFactoryTest {

    @Test
    @DisplayName("Check the sorterchoice is null")
     void checkfornullvalue() throws SortLoaderException {
        Exception exception = assertThrows(SortLoaderException.class, ()-> SorterFactory.getSorter(""));
        assertTrue(exception.getMessage().equals("Invalid Sort Algorithum"));
    }

    @Test
    @DisplayName("Check the sorterchoice is 1")
     void checkforBubblesortone() throws SortLoaderException {
        Sorter sorter =  SorterFactory.getSorter("Bubble");
        Assertions.assertSame( (new BubbleSortAlgorithm()).getClass(),sorter.getClass());
    }

    @Test
    @DisplayName("Check the sorterchoice is 2")
     void checkforbinarysorttwo() throws SortLoaderException {
        Assertions.assertEquals((new BinaryTreeAlgorithm(50)).getClass(),SorterFactory.getSorter("BinaryTree").getClass());
    }

    @Test
    @DisplayName("Check the sorterchoice is 3")
     void checkformergesort() throws SortLoaderException {
        Assertions.assertEquals((new MergeSortAlgorithm()).getClass(),SorterFactory.getSorter("Merge").getClass());
    }
    @Test
    @DisplayName("Check the sorterchoice is 4")
    void checkformergefour() throws SortLoaderException {
        Assertions.assertEquals((new BubbleSortAlgorithm()).getClass(),SorterFactory.getSorter("Bubble").getClass());
        Assertions.assertEquals((new BinaryTreeAlgorithm(50)).getClass(),SorterFactory.getSorter("BinaryTree").getClass());
    }
    @Test
    @DisplayName("Check the sorterchoice is 5")
    void checkformergesix() throws SortLoaderException {
        Assertions.assertEquals((new BubbleSortAlgorithm()).getClass(),SorterFactory.getSorter("Bubble").getClass());
        Assertions.assertEquals((new MergeSortAlgorithm()).getClass(),SorterFactory.getSorter("Merge").getClass());
    }
    @Test
    @DisplayName("Check the sorterchoice is 6")
    void checkformergeseven() throws SortLoaderException {
        Assertions.assertEquals((new MergeSortAlgorithm()).getClass(),SorterFactory.getSorter("Merge").getClass());
        Assertions.assertEquals((new BinaryTreeAlgorithm(50)).getClass(),SorterFactory.getSorter("BinaryTree").getClass());
    }
    @Test
    @DisplayName("Check the sorterchoice is 7")
    void checkformergeeight() throws SortLoaderException {
        Assertions.assertEquals((new BubbleSortAlgorithm()).getClass(),SorterFactory.getSorter("Bubble").getClass());
        Assertions.assertEquals((new BinaryTreeAlgorithm(50)).getClass(),SorterFactory.getSorter("BinaryTree").getClass());
        Assertions.assertEquals((new MergeSortAlgorithm()).getClass(),SorterFactory.getSorter("Merge").getClass());
    }

}