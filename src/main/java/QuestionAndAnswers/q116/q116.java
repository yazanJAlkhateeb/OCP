package QuestionAndAnswers.q116;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class q116 {
    public static void main(String[] args) {
       /* Given that course.txt is accessible and contains:
        Course : : Java
        and given the code fragment:*/
            int i;
            char c;
            try (FileInputStream fis = new FileInputStream ("/home/yazan/IdeaProjects/OCP/src/main/resources/course.txt");
                 InputStreamReader isr = new InputStreamReader(fis);) {
                while (isr.ready()) { //line n1
                    isr.skip(2);
                    i = isr.read ();
                    c = (char) i;
                    System.out.print(c);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        /*
        What is the result?
        A. ur :: va
        B. ueJa///answer
        C. The program prints nothing.
        D. A compilation error occurs at line n1.*/
    }

