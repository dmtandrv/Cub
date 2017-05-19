package Honda;
import java.io.*;
import java.util.Comparator;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by darts on 16.05.17.
 * 1 Writing random integers (0-100) to file,
 * 2 Writing them to arraylist
 * 3 Sorting arraylist
 * 4 Writing arraylist to file
 */
public class FileWorks {
    public static void main(String[] args) throws IOException {
        //random file stuff
        FileWriter rndWriter = new FileWriter(System.getProperty("user.dir")+"/rndFile", false);
        Random random= new Random();
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        for (int i=0; i<100; i++) {
            int tempRnd = random.nextInt(100);
            rndWriter.append(String.valueOf(tempRnd) + '\n');
            randomList.add(tempRnd);
        }
        rndWriter.flush();

        Collections.sort(randomList,new Comparator<Integer>() {
                    public int compare(Integer o1, Integer o2) {
                        return o1.compareTo(o2);
                    }
        });

        //sorted file stuff
        FileWriter sortedWriter = new FileWriter(System.getProperty("user.dir")+"/sortedFile", false);
        for(Object z : randomList){
            System.out.println(z);
            sortedWriter.append(String.valueOf(z)+ '\n');
        }
        sortedWriter.flush();
    }
}