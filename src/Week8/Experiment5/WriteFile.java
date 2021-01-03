package Week8.Experiment5;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws Exception{
        FileOutputStream FOS = new FileOutputStream("/home/susruth/IdeaProjects/Operating_Systems/" +
                "tweedle-dee.txt");

        String text = "Shoes and ships and sealing wax.";

        byte buffer[] = text.getBytes();

        FOS.write(buffer);

        FOS.close();
    }
}
