import java.util.*;

public class Hello {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.nextLine();

        int start = sc.nextInt(), end = sc.nextInt();

        System.out.println(s.substring(start, end));
    }
}
