package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckSortingTest {
    @Test
    public void testIsSortedTrue() {
        int[] sortedArray = {1, 2, 3, 4, 5, 6};
        assertTrue(CheckSorting.isSorted(sortedArray));
    }

    @Test
    public void testIsSortedFalse() {
        int[] unsortedArray = {1, 3, 2, 4, 5, 6};
        assertFalse(CheckSorting.isSorted(unsortedArray));
    }

}