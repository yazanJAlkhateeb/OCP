package QuestionAndAnswers.q51;

class MissingInfoException extends Exception {
}
 
class AgeOutofRangeException extends Exception {
}
 
class Candidate {
 
    String name;
    int age;
 
    Candidate(String name, int age) throws Exception {
        if (name == null) {
            throw new MissingInfoException();
        } else if (age <= 10 || age >= 150) {
            throw new AgeOutofRangeException();
        } else {
            this.name = name;
            this.age = age;
        }
    }
 
    public String toString() {
        return name + " age: " + age;
    }
}