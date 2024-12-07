package learning.java;

// бінарний пошук працює тільки з відсортованим масивом
public class CheckSorting {
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
