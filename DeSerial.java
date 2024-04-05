package SerializationDeSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("kj.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Student s=(Student)ois.readObject();
            s.jee();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}