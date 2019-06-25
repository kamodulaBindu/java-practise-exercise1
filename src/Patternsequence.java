import java.util.Scanner;

public class Patternsequence {
    public static void main(String args[])
    {
        int i,j,n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        sequence(n);

    }

    private static void sequence(int n) {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }

        }
    }
}
