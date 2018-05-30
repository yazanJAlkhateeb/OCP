package D$$FunctionalProgramming.C$$WorkingwithPrimitives;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummarizingStatistics {
    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax()-stats.getMin();
    }

    public static void main(String[] args) {
        IntSummaryStatistics summary = IntStream.of(1, 2, 3).summaryStatistics();
        System.out.println(summary.getMax());
        System.out.println(summary.getMin());
        System.out.println(summary.getAverage());
        System.out.println(summary.getSum());


    }
}
