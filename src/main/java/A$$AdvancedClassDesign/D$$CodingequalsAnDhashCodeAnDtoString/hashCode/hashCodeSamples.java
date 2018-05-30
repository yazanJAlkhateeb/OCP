package A$$AdvancedClassDesign.D$$CodingequalsAnDhashCodeAnDtoString.hashCode;

public class hashCodeSamples {
    /*which has three instance variables and only used idNumber in
the equals() method, which of these do you think are legal hashCode() methods?


public int hashCode() { return idNumber; }
public int hashCode() { return 6; }
public long hashcode() { return idNumber; }
public int hashCode() { return idNumber * 7 + age; }

Line 16 is what you would expect the hashCode() method to be. Line 17 is also legal. It
isn’t particularly efficient. It is like putting the deck of cards in one giant pile. But it is legal.
Line 18 is not an override of hashCode() . It uses a lowercase c , which makes it a different
method. If it were an override, it wouldn’t compile because the return type is wrong. Line
19 is not legal because it uses more variables than equals() .*/
}
