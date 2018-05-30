package QuestionAndAnswers.q14;

import java.util.Arrays;
import java.util.List;

public class q14 {
    public static void main(String[] args) {
      //  Given the code fragment:
        List<String> codes = Arrays.asList ("DOC", "MPEG", "JPEG");
        codes.forEach (c -> System.out.print(c + " "));
        String fmt = codes.stream()
                .filter (s-> s.contains ("PEG"))
                .reduce((s, t) -> s + t).get();
        System.out.println("\n" + fmt);
      /*  What is the result?
        A. DOC MPEG JPEG //////////////////answer
                MPEGJPEG
        B. DOC MPEG MPEGJPEG
                MPEGMPEGJPEG
        C. MPEGJPEG
                MPEGJPEG
        D. The order of the output is unpredictable.*/
    }
}
