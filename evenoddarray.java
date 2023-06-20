import java.util.Scanner;

public class evenoddarray {
    public static void main(String[] args) {
        int n, i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the values of an array");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("Odd numbers");
        for (i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Even numbers");
        for (i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }

    }
}