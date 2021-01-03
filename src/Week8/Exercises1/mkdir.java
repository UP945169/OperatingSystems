package Week8.Exercises1;

import java.io.File;

public class mkdir {
    public static void main(String[] args) {
        File f = new File("/home/susruth/IdeaProjects/Operating_Systems/otherfolder");

        if(f.mkdir()){
            System.out.println("Directory is created");
        }

        else{
            System.out.println("Directory cannot be created");
        }
    }
}
