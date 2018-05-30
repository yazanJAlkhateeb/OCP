package H$$IO.C$$WorkingwithStreams.TheObjectInputStreamandObjectOutputStreamClasses;

public class ConceptOfObjectOutInStream {
    /*
    The ObjectOutputStream class includes a method to serialize the object to the stream
called void writeObject(Object)
     */
    /*
    If the provided object is not Serializable , or
it contains an embedded reference to a class that is not Serializable or not marked
transient , a NotSerializableException will be thrown at runtime
     */
    /*
    the ObjectInputStream class includes a deserialization
method that returns an object called readObject() .
     */

    /*
    he proper technique is to catch an EOFException ,
which marks the program encountering the end of the file.
     */
}
