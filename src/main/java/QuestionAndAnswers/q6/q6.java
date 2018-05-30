package QuestionAndAnswers.q6;

import java.io.IOException;

public class q6 {

      //  Given:
        static final class Folder implements AutoCloseable { //line n1
            //line n2
            public void open () {
                System.out.print("Open");
            }

          @Override
          public void close() throws IOException{
              System.out.println("Close");
          }
      }

        }
      //  Which two modifications enable the code to print Open Close?
//A. Replace line n1 with://////////////answer
//class Folder implements AutoCloseable {
//B. Replace line n1 with:
//class Folder extends Closeable {
//C. Replace line n1 with:
//class Folder extends Exception {
//D. At line n2, insert:
//System.out.print(“Close”);
//}
//E. At line n2, insert:////////////////answer
//public void close () throws IOException {
//System.out.print(“Close”);
//}
