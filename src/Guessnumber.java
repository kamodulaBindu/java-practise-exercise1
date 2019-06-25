import java.util.Scanner;

public class Guessnumber {
    public static void main(String args[]){
        int i,m=51,l;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        guess(n,m);

    }

    private static void guess(int n, int m) {
        if( n==m){
            System.out.println("Number guessed matches the original number");
        }
        else if(n>m){
            System.out.println("Number is greater than the original number");

        }
        else if(n<m){
            System.out.println("Number is smaller than the original number");

        }
    }
}
