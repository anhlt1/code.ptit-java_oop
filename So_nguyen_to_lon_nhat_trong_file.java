package java_oop;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

/**
 *
 * @author anhla
 */
public class So_nguyen_to_lon_nhat_trong_file {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        
        boolean[] check = new boolean[1000001];
        Arrays.fill(check, true);
        check[0] = check[1] = false;
        for(int i = 2 ; i <= Math.sqrt(1000001) ; ++i)
            if(check[i])
                for(int j = i * i ; j <= 1000000 ; j += i)
                    check[j] = false;
        
        
        TreeMap<Integer, Integer> m = new TreeMap<>(Collections.reverseOrder());
        for(int i : a)
        {
            if(check[i])
                if(m.containsKey(i))
                    m.put(i, m.get(i) + 1);
                else 
                    m.put(i, 1);
        }
        int i = 0;
        for(Map.Entry<Integer, Integer> e : m.entrySet()){
            ++i;
            System.out.println(e.getKey() + " " + e.getValue());
            if(i == 10)
                break;
        }
    }
}
