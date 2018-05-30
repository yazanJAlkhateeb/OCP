package A$$AdvancedClassDesign.E$$WorkingwithEnums;

public class EnumSample {
    public enum Season {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER);
        System.out.println(s == Season.SUMMER);
    }
}
