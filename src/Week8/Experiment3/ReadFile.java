package Week8.Experiment3;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws Exception{
        FileInputStream FIS = new FileInputStream("/home/susruth/IdeaProjects/Operating_Systems/FILE_DUMP/" +
                "tweedle-dum.txt");

        byte buffer[] = new byte[1000];

        int numBytesRead = FIS.read(buffer);

        System.out.println(new String(buffer));
    }
}
