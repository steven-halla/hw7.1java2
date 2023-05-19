public class Test {
    public static void main(String[] args) {
        int[] list = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 7;
        int index = recursiveBinarySearch(list, key);

        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the list.");
        }
    }

    public static int recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, key, low, high);
    }

    public static int recursiveBinarySearch(int[] list, int key,
                                            int low, int high) {
        if (low > high) // The list has been exhausted without a match
            return -low - 1; // Return -insertion point - 1

        int mid = (low + high) / 2;
        if (key < list[mid])
            return recursiveBinarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
            return mid;
        else
            return recursiveBinarySearch(list, key, mid + 1, high);
    }
}
