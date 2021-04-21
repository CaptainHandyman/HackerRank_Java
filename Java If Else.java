import java.util.*;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();

        if (n % 2 != 0)
            System.out.println("Weird");

        if (n >= 2 && n <= 5 && n % 2 == 0)
            System.out.println("Not Weird");
        else if (n >= 6 && n <= 20 && n % 2 == 0)
            System.out.println("Weird");

        if (n > 20 && n % 2 == 0)
            System.out.println("Not Weird");

        scan.close();
    }
}
