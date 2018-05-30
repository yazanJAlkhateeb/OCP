package C$$GenericsandCollections.A$$WorkingwithGenerics.S$$Bounds.LowerBoundedWildcards;

public class UnderstandGenericSupertypes {
/*When you have subclasses and superclasses, lower bounds can get tricky:
3: List<? super IOException> exceptions = new ArrayList<Exception>();
4: exceptions.add(new Exception());	 // DOES NOT COMPILE
5: exceptions.add(new IOException());
6: exceptions.add(new FileNotFoundException());
Line 3 references a List that could be List<IOException> or List<Exception> or
List<Object> . Line 4 does not compile because we could have a List<IOException> and
an Exception object wouldn’t fit in there.
Line 4 is fine. IOException can be added to any of those types. Line 5 is also fine. File-
NotFoundException can also be added to any of those three types. This is tricky because
FileNotFoundException is a subclass of IOException and the keyword says super . What
happens is that Java says “Well, FileNotFoundException also happens to be an IOEx-
ception , so everything is fine.”*/
}
