package D$$FunctionalProgramming.A$$WorkingwithBuiltInFunctionalInterfaces.ReturningOptional;

import java.util.Optional;

public class OptionalWithMethodsSamples {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();

        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        Optional<Double> average = average(5);
        average.ifPresent(x -> System.out.println(x));
        average.orElse(10.00);
        average.orElseGet(()-> (10.2));
        average.orElseThrow(IllegalStateException::new);

    }
}
