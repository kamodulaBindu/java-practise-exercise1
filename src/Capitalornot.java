import java.util.Scanner;

public class Capitalornot {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        checkChar(ch);





    }

    private static void checkChar(char ch) {
        if (ch>=65 && ch<=90) {
            System.out.println("Capital letter");
        }
        else if (ch>=97 && ch<=122) {
            System.out.println("Small case letter");
        }
        else if (ch>=48 && ch<=57) {
            System.out.println("digit");
        }
        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)||
                (ch>=91 && ch<=96)||(ch>=123 && ch<=127)) {
            System.out.println("special symbol");
        }
    }
}
