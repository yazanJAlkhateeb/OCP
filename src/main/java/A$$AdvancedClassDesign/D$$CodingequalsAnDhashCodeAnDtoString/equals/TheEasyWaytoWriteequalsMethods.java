package A$$AdvancedClassDesign.D$$CodingequalsAnDhashCodeAnDtoString.equals;

public class TheEasyWaytoWriteequalsMethods {
   /* Like toString() , you can use Apache Commons Lang to do a lot of the work for you. If
    you want all of the instance variables to be checked, your equals() method can be one
    line:*/
  /*  public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
    This is nice. However, for equals() , it is common to look at just one or two instance vari-
    ables rather than all of them.
    public boolean equals(Object obj) {
        if ( !(obj instanceof LionEqualsBuilder)) return false;
        Lion other = (Lion) obj;
        return new EqualsBuilder().appendSuper(super.equals(obj))
                .append(idNumber, other.idNumber)
                .append(name, other.name)
                .isEquals();*/
    }

