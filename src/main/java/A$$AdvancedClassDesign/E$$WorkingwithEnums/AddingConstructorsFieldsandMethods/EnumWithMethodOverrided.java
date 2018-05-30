package A$$AdvancedClassDesign.E$$WorkingwithEnums.AddingConstructorsFieldsandMethods;

public class EnumWithMethodOverrided {
    public enum Season3 {
        WINTER {
            public void printHours() { System.out.println("short hours"); }
        }, SUMMER {
            public void printHours() { System.out.println("long hours"); }
        }, SPRING, FALL;
        public void printHours() { System.out.println("default hours"); }
    }

    public static void main(String[] args) {
        Season3.FALL.printHours();
        Season3.WINTER.printHours();

    }
}
