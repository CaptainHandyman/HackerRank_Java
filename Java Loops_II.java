import java.util.Scanner;

public class Main {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            final int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();

            int s = a;

            for (int j = 0; j < n; j++) {
                s += (int) (Math.pow(2, j) * b);

                System.out.print(Integer.toString(s) + ' ');
            }

            System.out.printf("%n");
        }
    }
}
