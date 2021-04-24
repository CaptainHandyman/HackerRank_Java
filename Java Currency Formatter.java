import java.util.*;
import java.text.*;

public class Solution {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double _double = sc.nextDouble();

        sc.close();

        Locale India = new Locale("en", "IN");

        String US = NumberFormat.getCurrencyInstance(Locale.US).format(_double);
        String _India = NumberFormat.getCurrencyInstance(India).format(_double);
        String China = NumberFormat.getCurrencyInstance(Locale.CHINA).format(_double);
        String France = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(_double);

        System.out.println("US: " + US);
        System.out.println("India: " + _India);
        System.out.println("China: " + China);
        System.out.println("France: " + France);
    }
}
