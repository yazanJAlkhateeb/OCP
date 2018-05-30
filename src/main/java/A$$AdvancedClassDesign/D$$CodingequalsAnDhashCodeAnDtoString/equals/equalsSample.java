package A$$AdvancedClassDesign.D$$CodingequalsAnDhashCodeAnDtoString.equals;

public class equalsSample {
    class Lion {
    public Lion(int idNumber, int age, String name) {
        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Lion)) return false;
        Lion otherLion = (Lion) obj;
        return this.idNumber == otherLion.idNumber;
    }


         private int age;
         private String name;
        private int idNumber;
    }
}
