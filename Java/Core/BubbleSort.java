public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 6, 7, 4, 3, 5, 11 };
        System.out.println("Original Array :");
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println();

        // bubble sorting algo
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array : ");
        for (int i : arr) {
            System.out.print(" " + i);

        }
    }
}
