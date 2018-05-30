package F$$ExceptionsAndAssertions.C$$UsingMultiCatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class UsingMethod {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("dolphinsBorn.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate date = LocalDate.parse(text);
            System.out.println(date);
        } catch (DateTimeParseException e) {
            handleException(e);
        } catch (IOException e) {
            handleException(e);
        }
    }

    private static void handleException(Exception e) {
        e.printStackTrace();
        throw new RuntimeException(e);
    }
}
