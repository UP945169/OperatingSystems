package Week8.Experiment7;

import java.io.*;

public class RandomAccess {
    public static void main(String[] args) throws Exception{
        RandomAccessFile rand = new RandomAccessFile("/home/susruth/IdeaProjects/Operating_Systems/FILE_DUMP/tweedle-dum.txt", "r");

        byte buffer [] = new byte [100] ;

        rand.seek(100);

        int numBytesRead = rand.read(buffer) ;

        System.out.println(new String(buffer)) ;
    }
}
