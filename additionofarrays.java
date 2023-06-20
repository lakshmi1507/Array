import java.util.Arrays;
import java.util.Scanner;

public class additionofarrays {
    public static void main(String[] args) {

        int n, i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        System.out.println("Enter the elements of an array1");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of an array2");
        for (i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int c[] = new int[n];

        for (i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);

        }

    }

}
