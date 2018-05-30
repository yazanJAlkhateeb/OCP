package F$$ExceptionsAndAssertions.F$$WorkingwithAssertions;

public class ValidatingMethodParameters {
    /*Do not use assertions to check for valid arguments passed in to a method. Use an
IllegalArgumentException instead. For example, the constructor of Rectangle should
throw an IllegalArgumentException when either the width or height is negative:
public Rectangle(int width, int height) {
if(width < 0 || height < 0) {
throw new IllegalArgumentException();
}
this.width = width;
this.height = height;
}
This constructor greatly improves the reliability of the Rectangle class, because there
is no way to set the field’s width and height except in the constructor. Remember,
assertions are for situations where you are certain of something and you just want to
verify it. You cannot be certain that someone instantiating a Rectangle will pass in
positive values. However, with the Rectangle constructor defined here, you should be
able to assert with a great deal of certainty that invoking isValid on any Rectangle
object will return true .*/
}
