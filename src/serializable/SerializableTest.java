package serializable;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("src/serializable/test.out");

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Box oldBox = new Box(10, 20);
        oos.writeObject(oldBox);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Box newBox = (Box) ois.readObject();
        System.out.println(newBox);
    }


}
