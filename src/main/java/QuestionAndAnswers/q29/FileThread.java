package QuestionAndAnswers.q29;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class FileThread implements Runnable {
    String fName;

    public FileThread(String fName) {
        this.fName = fName;
    }

    public void run(){
        System.out.println(fName);
        
}
    public static void main (String[] args) throws IOException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Stream<Path> listOfFiles = Files.walk(Paths.get("/home/yazan/Downloads/movies/The.Neighbor.2017.HDRip.XviD.AC3-EVO"));
        listOfFiles.forEach(line -> {
            executor.execute(new FileThread(line.getFileName().toString()));
        });
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.DAYS);
//
//
    }
}
