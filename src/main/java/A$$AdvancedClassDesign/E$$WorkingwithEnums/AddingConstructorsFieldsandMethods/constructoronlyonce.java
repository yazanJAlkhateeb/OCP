package A$$AdvancedClassDesign.E$$WorkingwithEnums.AddingConstructorsFieldsandMethods;

public class constructoronlyonce {
  /*  Given that explanation, you can see why this code calls the constructor only once:*/
    public enum OnlyOne {
        ONCE (true);
        private OnlyOne(boolean b) {
            System. out .println("constructing");
        }
        public static void main(String[] args) {
// prints constructing
            OnlyOne firstCall = OnlyOne. ONCE ;
// doesn't print anything
            OnlyOne secondCall = OnlyOne. ONCE ;
        } }
}
