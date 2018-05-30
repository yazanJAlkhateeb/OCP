package G$$Concurrency.E$$WorkingwithParallelStreams.C$$UnderstandingPerformanceImprovements;

import java.util.ArrayList;
import java.util.List;

public class WhaleDataCalculatorWithParallelStream {
    public static void main(String[] args) {
        WhaleDataCalculatorWithParallelStream calculator = new WhaleDataCalculatorWithParallelStream();
// Define the data
        List<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < 4000; i++) data.add(i);
// Process the data
        long start = System.currentTimeMillis();
        calculator.processAllData(data);
        double time = ((System.currentTimeMillis()) - start) / 1000.0;
// Report results
        System.out.println("\nTasks completed in: " + time + " seconds");
    }

    public int processRecord(int input) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
// Handle interrupted exception
        }
        return input + 1;
    }

    public void processAllData(List<Integer> data) {
        data.parallelStream().map(a -> processRecord(a)).count();
    }
}