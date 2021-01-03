package Week8.Experiment4;

import java.io.* ;

public class Experiment4 {
    public static void main(String[] args) throws Exception {
        FileInputStream FIS = new FileInputStream("/home/susruth/IdeaProjects/Operating_Systems/FILE_DUMP/" +
                "tweedle-dum.txt");

        byte buffer[] = new byte[1000];

        int numBytesRead = FIS.read(buffer);

        while(numBytesRead > 0) {
            System.out.print(new String(buffer, 0, numBytesRead)) ;
            numBytesRead = FIS.read(buffer) ;
        }

    }
}
