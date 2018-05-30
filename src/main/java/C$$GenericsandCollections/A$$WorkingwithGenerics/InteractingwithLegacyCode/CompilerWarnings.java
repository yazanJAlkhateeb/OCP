package C$$GenericsandCollections.A$$WorkingwithGenerics.InteractingwithLegacyCode;

public class CompilerWarnings {
    /*
    * When compiling the LegacyDragon class,
the compiler warnings look something like this:
$ javac *.java
Note: Some input files use unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details

Java is basically telling you that it knows you are using old code and asking if you
want to know more. If you pass that flag, you get something like the following. (The
exact messages will depend on your compiler. For example, on some compilers, you’ll
get a fourth warning where the unicorns object is declared.)
$ javac -Xlint:unchecked *.java
LegacyDragons.java:9: warning: [unchecked] unchecked call to add(E) as a member
of the raw type List
unicorns.add(new Unicorn());
^
where E is a type-variable:
E extends Object declared in interface List
LegacyDragons.java:11: warning: [unchecked] unchecked method invocation: method
printDragons in class LegacyDragons is applied to given types
printDragons(unicorns);
^
required: List<Dragon>
found: List
LegacyDragons.java:11: warning: [unchecked] unchecked conversion
printDragons(unicorns);
^
required: List<Dragon>
found:
List
3 warnings
The messages look a little scary, but all Java is trying to tell you is that you should
really be using generics.*/
}
