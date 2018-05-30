package A$$AdvancedClassDesign.D$$CodingequalsAnDhashCodeAnDtoString.toString;

public class TheEasyWaytoWritetoStringMethods {
  /*  Apache Commons Lang ( http://commons.apache.org/proper/
            commons-lang/ ) provides some methods that you might wish were in core Java.
    This is all you have to write to have Apache Commons return all of the instance variables
    in a String :*/
    public String toString() {
        //return ToStringBuilder.reflectionToString(this);
   return null; }

  /*  You can write*/
   // @Override public String toString() {
 //       return ToStringBuilder.reflectionToString(this,
   //             ToStringStyle.SHORT_PREFIX_STYLE);
    //}
    /*
    This time our Hippo test class outputs Hippo[name=Harry,weight=3100.0] . There
    are a few other styles that support letting you choose to omit the class names or the
            instance variable names.*/
}

