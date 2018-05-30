package G$$Concurrency.E$$WorkingwithParallelStreams.E$$ProcessingParallelReductions.A$$PerformingOrderBasedTasks;

import java.util.Arrays;

public class CreatingUnorderedStreams {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6).stream().unordered().findAny().get());

        //or
        System.out.print(Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().findAny().get());
    }
}
