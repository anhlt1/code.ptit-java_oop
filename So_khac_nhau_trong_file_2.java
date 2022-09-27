package java_oop;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author anhla
 */
public class So_khac_nhau_trong_file_2 {
    public static void main(String[] args) throws FileNotFoundException {
        DataInputStream sc = new DataInputStream(new FileInputStream("D:\\data.in"));
        TreeMap<Integer, Integer> m = new TreeMap<>();
        int n;
        while(true){
            try {
                n = sc.readInt();
            } catch (IOException e) {
                break;
            }
            if(m.containsKey(n))
            {
                m.put(n, m.get(n) + 1);
            }
            else {
                m.put(n, 1);
            }
        }
        for(Map.Entry<Integer, Integer> e : m.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
