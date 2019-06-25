import java.util.Scanner;

public class Addintegers {
    public static void  adding(int n){
        int n1, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the values to add");
        for (int i=0; i<n;i++){
            n1 = input.nextInt();
            sum = sum+n1;
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        adding(n);
    }
}
