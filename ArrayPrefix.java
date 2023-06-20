import java.util.Scanner;

public class ArrayPrefix {
    public static int[] prefixSum(int[] arr, int start, int end) {
        int[] prefix = new int[end - start + 1];
        int currentSum = 0;

        for (int i = start; i <= end; i++) {
            currentSum += arr[i];
            prefix[i - start] = currentSum;
        }

        return prefix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the start point of the subarray: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end point of the subarray: ");
        int end = scanner.nextInt();

        int[] prefix = prefixSum(arr, start, end);

        // Print the prefix sum array
        System.out.println("Prefix sum array:");
        for (int num : prefix) {
            System.out.print(num + " ");
        }
    }
}
