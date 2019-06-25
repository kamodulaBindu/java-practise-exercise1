import java.util.Scanner;

public class Reverse {

    public static void main(String args[]) {
        String str;
        Scanner in = new Scanner(System.in);
        str = in.nextLine();

        reverse(str);
    }

    private static void reverse( String str) {
        int l,i;
        String reverse = " ";

        l = str.length();
        for (i = l - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }

}

