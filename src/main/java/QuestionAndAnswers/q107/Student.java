package QuestionAndAnswers.q107;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given:
class Student {
    String course, name, city;

    public Student(String name, String course, String city) {
        this.course = course;
        this.name = name;
        this.city = city;
    }
    public String getCourse() {
        return course;
    }

    //and the code fragment:
    public static void main(String[] args) {
        List<Student> stds = Arrays.asList(
                new Student("Jessy", "Java ME", "Chicago"),
                new Student("Helen", "Java EE", "Houston"),
                new Student("Mark", "Java ME", "Chicago"));
        Map<String, List<Student>> collect = stds.stream()
                .collect(Collectors.groupingBy(Student::getCourse));
        collect.forEach((k,v)-> System.out.println(k));
    }

    public String toString() {
        return course + ":" + name + ":" + city;
    }
    //A. [Java EE: Helen:Houston]
    //[Java ME: Jessy:Chicago, Java ME: Mark:Chicago]
    //B. Java EE///answer
    //Java ME
    //C. [Java ME: Jessy:Chicago, Java ME: Mark:Chicago]
    //[Java EE: Helen:Houston]
    //D. A compilation error occurs.
}