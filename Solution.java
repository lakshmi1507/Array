import java.util.Scanner;

class Solution {

    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static void main(String[] args) {

        int i, n, j;
        int sum = 0;
        int s, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        n = sc.nextInt();
        System.out.println("Enter the values of an array");
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the start point");
        s = sc.nextInt();
        System.out.println("Enter the end point");
        e = sc.nextInt();
        sum = 0;
        for (i = s; i == e; i++) {

            sum = sum + a[i];

        }

        System.out.println("The sum is" + sum);
        // Your code here
    }
}
