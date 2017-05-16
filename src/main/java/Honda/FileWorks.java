package Honda;
import java.io.*;
import java.util.Random;

/**
 * Created by darts on 16.05.17.
 */
public class FileWorks {
    public static void main(String[] args) throws IOException {
        //todo un. project folder
        FileWriter rndWriter = new FileWriter("/home/darts/IdeaProjects/Cub/rndFile", false);
        int rnd;
        Random random= new Random();
        for (int i=0; i<100; i++) {
            rnd=random.nextInt(100);
            rndWriter.append(String.valueOf(rnd)+'\n');
            rndWriter.flush();
        }


        //todo un. project folder
        FileWriter sortedWriter = new FileWriter("/home/darts/IdeaProjects/Cub/sortedFile", false);


    }
}