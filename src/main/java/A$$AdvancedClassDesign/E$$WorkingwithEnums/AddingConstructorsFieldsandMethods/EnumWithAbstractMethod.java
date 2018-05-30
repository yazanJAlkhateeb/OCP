package A$$AdvancedClassDesign.E$$WorkingwithEnums.AddingConstructorsFieldsandMethods;

public class EnumWithAbstractMethod {

    public enum Season {
        WINTER {
            public void printHours() {
                System.out.println("9am-3pm");
            }
        }, SPRING {
            public void printHours() {
                System.out.println("9am-5pm");
            }
        }, FALL {
            public void printHours() {
                System.out.println("9am-5pm");
            }
        };

        public abstract void printHours();
    }

    public static void main(String[] args) {
        Season.FALL.printHours();
    }
}
