import java.util.Arrays;
import java.util.Scanner;

public class largestarray {
    public static void main(String[] args) {
        int max, i, n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values of an array");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        max = a[0];
        for (i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];

            }
        }
        System.out.println("Maximum value " + max);

    }
}