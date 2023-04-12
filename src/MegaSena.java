import java.util.Set;
import java.util.HashSet;
import java.util.Random;

public class MegaSena {
    public static final int MAX_NUMBERS = 60;
    public static final int NUMBERS_TO_DRAW = 6;

    public static void main(String[] args) {
        Random generate = new Random();
        Set<Integer> drawnNumbers = new HashSet<>();

       System.out.println("Números sorteados na MEGA-SENA:");

       for(int i = 0; i < NUMBERS_TO_DRAW; i++) {
           int number;

           do {
               number = generate.nextInt(MAX_NUMBERS) + 1;
           } while (drawnNumbers.contains(number));

           drawnNumbers.add(number);
           System.out.printf("%d ", number);
       }
    }
}
