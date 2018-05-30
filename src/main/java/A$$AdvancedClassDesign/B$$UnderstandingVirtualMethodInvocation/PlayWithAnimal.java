package A$$AdvancedClassDesign.B$$UnderstandingVirtualMethodInvocation;

abstract class Animal2 {
    String name = "???";

    public void printName() {
        System.out.println(name);
    }
}

class Lion extends Animal2 {
    String name = "Leo";

    @Override
    public void printName() {
            System.out.println(name);
        }
    }
public class PlayWithAnimal {
    public static void main(String... args) {
        Animal2 animal = new Lion();
        animal.printName();
    }
   /* The name declared in Lion would only be used if name was referred to
    from Lion (or a subclass of Lion .) But no matter how you call printName() , it will use the
    Animal ’s name, not the Lion ’s name.*/
}