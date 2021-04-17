import java.util.Scanner;

public class Solution {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            if (n * i % n == 0)
                System.out.printf("%s%n",
                        Integer.toString(n) + " x " + Integer.toString(i) + " = " + Integer.toString(n * i));
        }
    }
}
