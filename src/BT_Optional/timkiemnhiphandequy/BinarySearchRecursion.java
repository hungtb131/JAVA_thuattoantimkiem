package BT_Optional.timkiemnhiphandequy;

public class BinarySearchRecursion {
    int binarySearch(int[] array, int low, int high, int x) {
        if (low < 0 || high >= array.length)
            return -1;
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x)
                return mid;
            else if (array[mid] > x)
                return binarySearch(array, low, mid - 1, x);
            else
                return binarySearch(array, mid + 1, high, x);
        }
        return -1;
    }
}
