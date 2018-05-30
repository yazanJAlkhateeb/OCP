package QuestionAndAnswers.q106;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class q106 {
    public static void main(String[] args) throws IOException {
        //Given the code fragment:
        Path source = Paths.get ("/home/yazan/u02/log.txt");
        Path destination = Paths.get("/home/yazan/");
        Files.copy (source, destination);
      //  and assuming that the file /data/december/log.txt is accessible and contains:
     //   10-Dec-2014 – Executed successfully
      /*  What is the result?
        A. A file with the name log.txt is created in the /data directory and the content of the
/data/december/log.txt file is copied to it.
                B. The program executes successfully and does NOT change the file system.
        C. A FileNotFoundException is thrown at run time.
                D. A FileAlreadyExistsException is thrown at run time.///answer*/
    }
}
