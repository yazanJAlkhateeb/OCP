package D$$FunctionalProgramming.D$$WorkingwithAdvancedStreamPipelineConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LinkingStreamsToUnderlyingData {
    public static void main(String[] args) {
       // What do you think this outputs?
        List<String> cats = new ArrayList<>();
        cats.add("Annie");
        cats.add("Ripley");
        Stream<String> stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count());

       //the output is 3 as the stream lazy , the stream look to the source when it count
    }
}
