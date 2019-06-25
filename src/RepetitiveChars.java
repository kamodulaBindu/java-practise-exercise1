import java.util.Scanner;

public class RepetitiveChars {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("enter a string");
        String str = in.nextLine();
        System.out.println("enter a number");
        int n = in.nextInt();

        repetitionOfChars(str, n);

    }

    private static void repetitionOfChars(String str, int n) {
        int len = str.length();
        System.out.print(str);
        int j =len-n;
        for (int k=0;k<n;k++){
            for (int i = j ; i<len; i++){
                System.out.print(str.charAt(i));
            }
        }
    }
}
