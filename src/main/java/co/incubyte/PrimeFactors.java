package co.incubyte;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> ofNumber(int number) {
        List<Integer> primeFactors = new ArrayList<>(List.of());
        for (int i = 2; i * i <= number || number > 1; i++) {
            if (number % i == 0) {
                while (number % i == 0) {
                    primeFactors.add(i);
                    number /= i;
                }
            }
        }
        return primeFactors;
    }
}