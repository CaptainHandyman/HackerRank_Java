import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);

    static int i = 0;

    public static void main(String[] args) {
        while (sc.hasNext()) {
            i++;

            System.out.println(Integer.toString(i) + ' ' + sc.nextLine());
        }
    }
}
