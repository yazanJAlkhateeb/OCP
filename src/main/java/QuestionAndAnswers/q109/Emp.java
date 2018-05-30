package QuestionAndAnswers.q109;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Given:
public class Emp {
    String fName;
    String lName;

    public Emp(String fn, String ln) {
        fName = fn;
        lName = ln;
    }

    //and the code fragment:
    public static void main(String[] args) {
        List<Emp> emp = Arrays.asList(
                new Emp("John", "Smith"),
                new Emp("Peter", "Sam"),
                new Emp("Thomas", "Wale"));
        emp.stream().sorted(Comparator.comparing(Emp::getfName).reversed().thenComparing(Comparator.comparing(Emp::getlName)))
//line n1
                .collect(Collectors.toList());
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
}
/*
Which code fragment, when inserted at line n1, sorts the employees list in descending order of fName
and then ascending order of lName?
A. .sorted (Comparator.comparing(Emp::getfName).reserved().thenComparing(Emp::getlName))
B. .sorted (Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName))
C. .map(Emp::getfName).sorted(Comparator.reserveOrder())
D. .map(Emp::getfName).sorted(Comparator.reserveOrder().map(Emp::getlName).reserved*/