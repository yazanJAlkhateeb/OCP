package H$$IO.C$$WorkingwithStreams.TheObjectInputStreamandObjectOutputStreamClasses;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamSample {
    public static List<Object> getObjects(File dataFile) throws IOException,

            ClassNotFoundException {
        List<Object> Objects = new ArrayList<Object>();
        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(dataFile)))) {
            while (true) {
                Object object = in.readObject();
                if (object instanceof Object)
                    Objects.add(object);
            }
        } catch (EOFException e) {
// File end reached
        }
        return Objects;
    }

    public static void createObjectsFile(List<Object> Objects, File dataFile)
            throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Object Object : Objects)
                out.writeObject(Object);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Object> Objects = new ArrayList<Object>();
        Objects.add(new Object());
        Objects.add(new Object());
        File dataFile = new File("Object.data");
        createObjectsFile(Objects, dataFile);
        System.out.println(getObjects(dataFile));
    }
}