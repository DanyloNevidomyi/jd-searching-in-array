package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    public void testSearchKeyFound() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        assertEquals(3, binarySearch.search(array, 7));
    }

    @Test
    public void testSearchKeyNotFound() {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        assertEquals(-1, binarySearch.search(array, 8));
    }

}