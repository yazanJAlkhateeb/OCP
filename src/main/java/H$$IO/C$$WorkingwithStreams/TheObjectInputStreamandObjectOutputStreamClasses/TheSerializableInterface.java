package H$$IO.C$$WorkingwithStreams.TheObjectInputStreamandObjectOutputStreamClasses;

public class TheSerializableInterface {
    /*
    In order to serialize objects using the java.io API, the class they belong to must implement
the java.io.Serializable interface. The Serializable interface is a tagging or marker
interface,
     */

    /*
    A process attempting to serialize an object will throw a NotSerializableException
if the class or one of its contained classes does not properly implement the Serializable
interface.
     */

    /*
    You can use the transient keyword on the reference to the object,
which will instruct the process serializing the object to skip it and avoid throwing a
NotSerializableException .
     */
    /*
    he only limitation is that the data stored in the object will be
lost during the serialization process.
     */
    /*
    static class members will also be ignored during
the serialization and deserialization process. This should follow logically, as static class
variables do not belong to one particular instance. If you need to store static class infor-
mation, it will be need to be copied to an instance object and serialized separately.
     */
}
