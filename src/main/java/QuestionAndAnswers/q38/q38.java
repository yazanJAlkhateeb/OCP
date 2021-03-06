package QuestionAndAnswers.q38;

import java.nio.file.Path;
import java.nio.file.Paths;

public class q38 {
    public static void main(String[] args) {
        //Given the code fragment:
        Path path1 = Paths.get("/app/./sys/");
        Path res1 = path1.resolve("log");
        Path path2 = Paths.get("/server/exe/");
        Path res2 = path1.resolve("/readme/");
        System.out.println(res1);
        System.out.println(res2);
       /*What is the result?
        A. /app/sys/log
                /readme/server/exe
        B. /app/log/sys
                /server/exe/readme
        C. /app/./sys/log           ///answer
                /readme
        D. /app/./sys/log
                /server/exe/readme */
    }
}
