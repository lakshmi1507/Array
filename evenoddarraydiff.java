import java.util.Scanner;

public class evenoddarraydiff {
    public static void main(String[] args) {
        int i, n, diff;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the values of an array");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0 && a[i] > max) {
                max = a[i];
            }
            if (a[i] % 2 != 0 && a[i] < min) {
                min = a[i];
            }

        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        diff = max - min;
        System.out.println("The difference is " + diff);
    }
}
