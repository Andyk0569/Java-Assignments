public class FindSecondSmallest {
    public static void main(String[] args) {
        int arr[] = { 12, 13, 4, 10, 34, 5 };

        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // print the second number
        System.out.println("Second smallest element is " + arr[1]);

    }
}

/*
 * optimized
 * public class FindSecondSmallest {
 * public static void main(String[] args) {
 * int arr[] = { 12, 13, 4, 10, 34, 5 };
 * 
 * int first = Integer.MAX_VALUE;
 * int second = Integer.MAX_VALUE;
 * 
 * for (int num : arr) {
 * if (num < first) {
 * second = first;
 * first = num;
 * } else if (num < second && num != first) {
 * second = num;
 * }
 * }
 * 
 * System.out.println("Second smallest element is " + second);
 * }
 * }
 */