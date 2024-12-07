package learning.java;

public class SearchApp {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};

        if (CheckSorting.isSorted(sortedArray)) {
            int key = 7;
            int result = binarySearch.search(sortedArray, key);

            if (result != -1) {
                System.out.println("Індекс ключа: " + result);
            } else {
                System.out.println("Ключ не знайдено у масиві.");
            }
        } else {
            System.out.println("Масив не є відсортованим.");
        }
    }
}
