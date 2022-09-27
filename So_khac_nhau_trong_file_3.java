package java_oop;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

/**
 *
 * @author anhla
 */
public class So_khac_nhau_trong_file_3 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        int used[] = new int[1000];
        for (Integer i : a) used[i]++;
        for (int i = 0; i < 1000; i++)
            if (used[i] > 0) System.out.println(i + " " + used[i]);
    }
}
