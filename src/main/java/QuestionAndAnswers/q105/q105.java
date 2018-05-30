package QuestionAndAnswers.q105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q105 {

      //  Given the code fragment:
        public static void main (String [] args) throws IOException {
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            System.out.print ("Enter GDP: ");
//line 1
            int GDP = Integer.parseInt (br.readLine());
            System.out.println(GDP);
        }
      /*  Which code fragment, when inserted at line 1, enables the code to read the GDP from the user?
        A. int GDP = Integer.parseInt (br.readline());///answer
        B. int GDP = br.read();
        C. int GDP = br.nextInt();
        D. int GDP = Integer.parseInt (br.next());*/
    }

