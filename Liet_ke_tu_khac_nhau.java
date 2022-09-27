package java_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author anhla
 */

class WordSet {
    String s = "";

    public String toString() {
        return s;
    }

    WordSet (String str) {
        File f = new File(str);
       
        try{
            Scanner sc = new Scanner(f);
            Set<String> set = new HashSet<String>();
            Vector<String> v = new Vector<>();
            while(sc.hasNext())
            {
                String[] a = sc.nextLine().toLowerCase().split(" ");
                for(int i = 0 ; i < a.length ; ++i)
                    set.add(a[i]);
            }
            for(String i : set) v.add(i);
            Collections.sort(v);
            for(String i : v)
                s += i + System.lineSeparator();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
    
}

public class Liet_ke_tu_khac_nhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
