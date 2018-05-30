package A$$AdvancedClassDesign.E$$WorkingwithEnums;

public class valuesMethod {
    public static void main(String[] args) {
        /*An enum provides a method to get an array of all of the values. You can use this like any
normal array, including in a loop:*/
        for(EnumSample.Season season: EnumSample.Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

    }
}
