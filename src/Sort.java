import java.util.Scanner;

public class Sort {
    public static void main(String args[]) {
        sortingList();

    }

    private static void sortingList() {
        int n, i, j, swap;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter list to be sorted");
        n = in.nextInt();
        int array[] = new int[n];
        System.out.println("enter" + n + "integers");
        for (i = 0; i < n; i++)
            array[i] = in.nextInt();
        for (i = 0; i < n - 1; i++) {
            for (j = i; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                } else if (array[j] == array[j + 1]) {
                    array[j] = array[j];
                    array[j + 1] = array[j + 1];
                }

            }
        }

        System.out.println("sorted list of elements");
        for (i = n - 1; i >= 0; i--)
            System.out.println(array[i]);
        System.out.println();
        for (i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("sum of the even numbers is" + sum);
        if (sum > 15) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}