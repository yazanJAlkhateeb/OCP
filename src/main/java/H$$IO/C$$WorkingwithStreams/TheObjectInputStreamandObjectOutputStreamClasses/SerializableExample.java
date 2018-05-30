package H$$IO.C$$WorkingwithStreams.TheObjectInputStreamandObjectOutputStreamClasses;

import java.io.Serializable;

public class SerializableExample implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private char type;

    public SerializableExample(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getType() {
        return type;
    }

    public String toString() {
        return "AnimalSample [name=" + name + ", age=" + age + ", type=" + type + "]";
    }
}

