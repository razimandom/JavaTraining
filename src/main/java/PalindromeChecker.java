import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanText = new Scanner(System.in);
        String str = scanText.next();

        StringBuilder sb = new StringBuilder();

        sb.append(str);
        sb.reverse();

        System.out.println(str);
        System.out.println(sb);

        if (str.equals(sb.toString()))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is not palindrome");



    }

}
