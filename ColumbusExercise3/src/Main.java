import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static ArrayList findDuplicateNumbers(ArrayList<Long> numbers) {
        ArrayList<Long> duplicateNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if ((numbers.get(i) == numbers.get(j)) && (!duplicateNumbers.contains(numbers.get(i)))) {
                    duplicateNumbers.add(numbers.get(i));
                }
            }
        }

        return duplicateNumbers;
    }

    public static ArrayList generateRandomNumbers(int numberOfRandomNumbers) {
        ArrayList<Long> numbers = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < numberOfRandomNumbers; i++) {
            long randomNumber = random.nextInt(3);
            numbers.add(randomNumber);
        }

        return numbers;
    }
    public static void main(String[] args) {
        System.out.println(findDuplicateNumbers(generateRandomNumbers(100)));
    }
}