package Week8.Exercises1;

import java.io.File;

public class listFile {
    public static void main(String[] args) {
        //Creating a File object for directory
        File directoryPath = new File("/home/susruth/IdeaProjects/Operating_Systems/newFile");

        //List of all files and directories
        String contents[] = directoryPath.list();

        System.out.println("List of files and directories in the specified directory:");


        for(int i=0; i<contents.length; i++) {
            System.out.println(contents[i]);
        }
    }
}
