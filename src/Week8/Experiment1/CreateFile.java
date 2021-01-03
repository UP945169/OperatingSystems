package Week8.Experiment1;


import java.io.*;


public class CreateFile {
    public static void main(String[] args) throws Exception{
        File dum = new File("//home/susruth/IdeaProjects/Operating_Systems/FILE_DUMP/tweedle-dum.txt");

        File dee = new File("tweedle-dee.txt");

        dum.createNewFile();

        dee.createNewFile();
    }
}