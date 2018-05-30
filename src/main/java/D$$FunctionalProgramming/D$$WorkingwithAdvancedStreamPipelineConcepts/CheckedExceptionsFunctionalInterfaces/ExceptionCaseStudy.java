package D$$FunctionalProgramming.D$$WorkingwithAdvancedStreamPipelineConcepts.CheckedExceptionsFunctionalInterfaces;

import java.io.IOException;
import java.util.List;

public class ExceptionCaseStudy {
    private static List<String> create() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {
        //ExceptionCaseStudy.create().stream().count();//DoesNot COmpile
        ExceptionCaseStudy.createSafe().stream().count();
        //work around number 1
        try {
            ExceptionCaseStudy.create().stream().count();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
    //the second work around is to create other Method to wrap the throwing method
    private static List<String> createSafe() {
        try {
            return ExceptionCaseStudy.create();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } }
}