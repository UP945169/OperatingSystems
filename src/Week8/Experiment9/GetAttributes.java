package Week8.Experiment9;

import java.io.*;
import java.util.*;

public class GetAttributes {
    public static void main(String[] args) throws Exception{
        File dum = new File("/home/susruth/IdeaProjects/Operating_Systems/" +
                "FILE_DUMP/tweedle-dum.txt");

          System.out.println("Is a directory?: " + dum.isDirectory()) ;
          System.out.println("Is an ordinary file?: " + dum.isFile()) ;
          System.out.println("Length: " + dum.length()) ;
          System.out.println("Last modified: " + new Date(dum.lastModified())) ;
          System.out.println("Can be read by this process?: " + dum.canRead()) ;
          System.out.println("Can be written by this process?: " + dum.canWrite()) ;
          System.out.println("Is a hidden file?: " + dum.isHidden()) ;
    }

}
