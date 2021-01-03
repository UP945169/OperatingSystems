package Week8.Experiment2;

import java.io.*;

public class DeletingFiles {
    public static void main(String[] args) throws Exception{

        File dum = new File("/home/susruth/IdeaProjects/Operating_Systems/FILE_DUMP");

        File dee = new File("tweedle-dee.txt");

        dum.delete();

        dee.delete();
    }
}
