import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int _int = scanner.nextInt();
        final double _double = scanner.nextDouble();
        scanner.nextLine();
        final String _String = scanner.nextLine();

        System.out.println("String: " + _String);
        System.out.println("Double: " + Double.toString(_double));
        System.out.println("Int: " + Integer.toString(_int));
    }
}
