package learning.java;

public class BinarySearch {
    public int search(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            // перевірка чи ключ посередині
            if (array[middle] == key) {
                return middle;
            }
            // розподілення позиції ключа
            if (array[middle] > key) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
