package QuestionAndAnswers.q32;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class q32 {
    public static void main(String[] args) throws IOException {
      //  Given that /green.txt and /colors/yellow.txt are accessible, and the code fragment:
        Path source = Paths.get("/home/yazan/green.txt");
        Path target = Paths.get("/home/yazan/colors/yellow.txt");
        Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
        Files.delete(source);
      /*  Which statement is true?
                A. The green.txt file content is replaced by the yellow.txt file content and the yellow.txt file is deleted.
        B. The yellow.txt file content is replaced by the green.txt file content and an exception is thrown./////answer
        C. The file green.txt is moved to the /colors directory.
        D. A FileAlreadyExistsException is thrown at runtime ///answer.*/
    }
}
