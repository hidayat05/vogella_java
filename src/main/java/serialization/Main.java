package serialization;

import java.io.*;

/**
 * @owner nurhidayat
 * @since 4/28/17.
 */
public class Main {
    public static void main(String[] args) {
        String fileName = "time.ser";
        Person person = new Person("Lars", "Vogel");

        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(fileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(person);

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(fileName);
            in = new ObjectInputStream(fis);
            person = (Person) in.readObject();

            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(person);
    }
}
