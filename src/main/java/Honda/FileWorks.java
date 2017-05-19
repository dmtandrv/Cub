package Honda;
import java.io.*;
import java.util.Comparator;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by darts on 16.05.17.
 * 1 Writing 100 random integers (0-1000) to arraylist
 * 2 Writing arraylist to file
 * 3 Sorting arraylist
 * 4 Writing sorted arraylist to file
 */
public class FileWorks {
    public static void main(String[] args) throws IOException {

        // 1 Writing random integers (0-100) to arraylist
        Random random= new Random();
        ArrayList<Integer> randomList = new ArrayList<Integer>();

        for (int i=0;i<100;i++) {
            randomList.add(random.nextInt(1000));
        }

        // 2 Writing arraylist to file
        FileWriter rndWriter = new FileWriter(System.getProperty("user.dir")+"/rndFile", false);
        for(Object z : randomList){
            rndWriter.append(String.valueOf(z)+ '\n');
        }
        rndWriter.flush();

        // 3 Sorting arraylist
        Collections.sort(randomList,new Comparator<Integer>() {
                    public int compare(Integer o1, Integer o2) {
                        return o1.compareTo(o2);
                    }
        });

        // 4 Writing sorted arraylist to file
        FileWriter sortedWriter = new FileWriter(System.getProperty("user.dir")+"/sortedFile", false);
        for(Object z : randomList){
            sortedWriter.append(String.valueOf(z)+ '\n');
        }
        sortedWriter.flush();
    }
}