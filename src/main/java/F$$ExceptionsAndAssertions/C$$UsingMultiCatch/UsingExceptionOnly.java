package F$$ExceptionsAndAssertions.C$$UsingMultiCatch;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class UsingExceptionOnly {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("dolphinsBorn.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate date = LocalDate.parse(text);
            System.out.println(date);
        } catch (Exception e) {
// BAD approach
            e.printStackTrace();
            throw new RuntimeException(e);
        } }
}
