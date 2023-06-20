import java.util.Scanner;

public class stringreverse {
    public static void main(String[] args) {
        String str = "ABCD";
        String rev = "";
        int len = str.length();
        for (int i = 1; i < len - 1; i++) {
            rev = rev + str.charAt(i);
        }
        System.out.print(rev);
    }
}