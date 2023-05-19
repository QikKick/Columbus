import java.util.Scanner;

public class Main {

    public static String reverseString(String str) {
        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }

    public static void main(String[] args) {

        String StartingLine;
        Scanner sc = new Scanner(System.in);
        StartingLine = sc.nextLine();
        System.out.println(reverseString(StartingLine));
    }
}