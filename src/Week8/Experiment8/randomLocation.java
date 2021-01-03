package Week8.Experiment8;

import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public class randomLocation {
    public static void main(String [] args) throws Exception {

        FileOutputStream out = new FileOutputStream("/home/susruth/IdeaProjects/Operating_Systems/tweedle-dee.txt");

        RandomAccessFile rand = new RandomAccessFile("/home/susruth/IdeaProjects/Operating_Systems/tweedle-dee.txt","rw");

        rand.seek(100);

        String text = "Shoes and ships and sealing wax.";

        byte buffer [] = text.getBytes();


        out.write(buffer);

        out.close();
    }
}
