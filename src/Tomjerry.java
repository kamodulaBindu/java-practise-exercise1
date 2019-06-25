import java.util.Scanner;

public class Tomjerry {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            tomOrJerry(n);

        }

    private static void tomOrJerry(int n) {
        if(n%2==0 && n>20 && n<30)
        {
            System.out.println("Tom");
        }
        else if( n%2!=0 && n>20 && n<30)
        {
            System.out.println("Jerry");

        }
    }
}

