package A$$AdvancedClassDesign.F$$CreatingNestedClasses.B$$LocalInnerClasses;

public class EffectivlyFinal {
    /*The compiler is generating a class fi le from your
inner class. A separate class has no way to refer to local variables. If the local variable is final ,
Java can handle it by passing it to the constructor of the inner class or by storing it in the class
fi le. If it weren’t effectively fi nal, these tricks wouldn’t work because the value could change
after the copy was made. Up until Java 7, the programmer actually had to type the final
keyword. In Java 8, the “effectively fi nal” concept was introduced. If the code could still com-
pile with the keyword final inserted before the local variable, the variable is effectively fi nal.*/


    /*Remember that the “effectively final” concept was introduced in Java 8. If
you are looking at older mock exam questions online, some of the answers
about local variables and inner classes might be different.*/

    /*public void isItFinal() {
int one = 20;
int two = one;
two++;
int three;
if ( one == 4) three = 3;
else three = 4;
int four = 4;
class Inner { }
four = 5; }
one is effectively final. It is only set in the line in which it is declared. two is not effec-
tively final. The value is changed on line 37 after it is declared. three is effectively final
because it is assigned only once. This assignment may happen in either branch of the if
statement, but it can happen in only one of them. four is not effectively final. Even though
the assignment happens after the inner class, it is not allowed.*/

}
