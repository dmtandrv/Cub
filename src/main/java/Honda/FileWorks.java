package Honda;
import java.io.*;
import java.util.Random;

/**
 * Created by darts on 16.05.17.
 */
public class FileWorks {
    public static void main(String[] args) throws IOException {
        FileWriter rndWriter = new FileWriter(System.getProperty("user.dir")+"/rndFile", false);
        int rnd;
        Random random= new Random();
        for (int i=0; i<100; i++) {
            rnd=random.nextInt(100);
            rndWriter.append(String.valueOf(rnd)+'\n');
            rndWriter.flush();
        }
        FileWriter sortedWriter = new FileWriter(System.getProperty("user.dir")+"/sortedFile", false);
    }
}