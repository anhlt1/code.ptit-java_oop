package java_oop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author anhla
 */
public class So_nguyen_to_trong_file {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream f = new FileInputStream("SONGUYEN.in");
        ObjectInputStream os = new ObjectInputStream(f);
        
        ArrayList<Integer> a = (ArrayList<Integer>) os.readObject();
        TreeMap<Integer, Integer> m = new TreeMap<>();
        int n;
        boolean[] check = new boolean[10001];
        Arrays.fill(check, true);
        check[0] = check[1] = false;
        for (int i = 2; i <= 10000; i++) {
            if (check[i] == true) {
                for (int j = 2 * i; j <= 10000; j += i) {
                    check[j] = false;
                }
            }
        }
        while (true) {
            try {
                n = sc.readInt();
            } catch (IOException e) {
                break;
            }
            if (m.containsKey(n)) {
                m.put(n, m.get(n) + 1);
            } else {
                if (check[n]) {
                    m.put(n, 1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
