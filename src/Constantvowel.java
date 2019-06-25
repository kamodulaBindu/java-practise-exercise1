import java.util.Scanner;

public class Constantvowel {

    public static void main(String[] args) {

        int i;
        char ch;
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        vowelOrConsonant(word);


    }

    private static void vowelOrConsonant(String word) {
        int i;
        int len = word.length();
        for(i=0;i<len;i++)
        {
            char c = word.charAt(i);
            if( c=='a' || c=='e'|| c=='i'||c=='o'|| c=='u')
            {
                System.out.println( "vowel");
            }
            else
            {
                System.out.println("consonant");
            }
        }
    }
}