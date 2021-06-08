import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String _String = "", smallest = s.substring(0, k),
                largest = s.substring(0, k), output = "";

        for (int i = 0; i < s.length(); i++) {
            if (i + k > s.length())
                break;

            _String += s.substring(i, i + k);

            if (smallest.compareTo(_String) > 0)
                smallest = _String;
            if (largest.compareTo(_String) < 0)
                largest = _String;

            _String = "";
        }

        output = smallest + '\n' + largest;
        
        return output;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
