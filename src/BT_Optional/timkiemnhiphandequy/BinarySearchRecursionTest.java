package BT_Optional.timkiemnhiphandequy;

public class BinarySearchRecursionTest {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        BinarySearchRecursion binarySearchRecursion = new BinarySearchRecursion();
        System.out.println(binarySearchRecursion.binarySearch(array, 0, 4, 1));
        System.out.println(binarySearchRecursion.binarySearch(array, 1, 8, 2));
        System.out.println(binarySearchRecursion.binarySearch(array, 2, 4, 3));
        //out range ne ahihi
        System.out.println(binarySearchRecursion.binarySearch(array, 3, 4, 6));
    }
}
