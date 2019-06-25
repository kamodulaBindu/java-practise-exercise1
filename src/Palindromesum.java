import java.util.Scanner;

public class Palindromesum {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = n;
        sum25(n);

    }


    private static void sum25(int n) {
        int m = n;
        int x, a = 0,sum = 0;
        while (n > 0) {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
            if (x % 2 == 0) {
                sum = sum + x;
            }
        }
        if (a == m) {
            if (sum > 25) {
                System.out.println(m + "is palindrome and the sum of even numbers is greater than 25");
             }
             else {

                System.out.println(m + "is a palindrome and the sum of even numbers is less than 25");
            }

        }
        else {
            System.out.println(m+"is not a palindrome");
        }

    }
}
