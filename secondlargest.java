import java.util.Arrays;
import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int secondLargest = arr[n - 2];

        System.out.println("The second array is: " + secondLargest);
    }
}
