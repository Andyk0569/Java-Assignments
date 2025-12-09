package core;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int middleNum = arr[mid];

            if (middleNum == x) {
                return mid;
            }
            if (x < middleNum) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 9, 11 };
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("Which number's position you want? ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(binarySearch(arr, x));
        scanner.close();
    }

}
