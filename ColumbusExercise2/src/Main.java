import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static long findSmallestNumber(ArrayList<Long> numbers) {
        long smallestNumber = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < smallestNumber) {
                smallestNumber = numbers.get(i);
            }
        }

        return smallestNumber;
    }

    public static long findLargestNumber(ArrayList<Long> numbers) {
        long largestNumber = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > largestNumber) {
                largestNumber = numbers.get(i);
            }
        }

        return largestNumber;
    }

    public static ArrayList generateRandomNumbers(int numberOfRandomNumbers) {
        ArrayList<Long> numbers = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < numberOfRandomNumbers; i++) {
            long randomNumber = random.nextInt();
            numbers.add(randomNumber);
        }

        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Long> numbers = new ArrayList<>(generateRandomNumbers(100));
        System.out.println(findLargestNumber(numbers) + " " + findSmallestNumber(numbers));
    }
}