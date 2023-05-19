import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void countVowelsAndConsonants(String text) {
        text = text.toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'ą' || text.charAt(i) == 'e'
                    || text.charAt(i) == 'ė' || text.charAt(i) == 'ę' || text.charAt(i) == 'i'
                    || text.charAt(i) == 'į' || text.charAt(i) == 'y' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'u' || text.charAt(i) == 'ų' || text.charAt(i) == 'Ū') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels + " Consonants: " + consonants);
    }
    public static void main(String[] args) {
        String text;
        text = scanner.nextLine();
        countVowelsAndConsonants(text);
    }
}