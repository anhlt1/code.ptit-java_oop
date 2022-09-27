package java_oop;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author anhla
 */
class IntSet {

    TreeSet<Integer> set = new TreeSet<>();

    public IntSet() {
    }

    public IntSet(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            set.add(a[i]);
        }
    }

    public int len() {
        return set.size();
    }

    public TreeSet<Integer> returnSet() {
        return set;
    }

    public IntSet intersection(IntSet a) {
        TreeSet<Integer> s = new TreeSet<>();
        TreeSet<Integer> s1 = a.returnSet();
        for (int i : set) {
            if (s1.contains(i)) {
                s.add(i);
            }
        }
        IntSet b = new IntSet();
        b.set = s;
        return b;
    }

    @Override
    public String toString() {

        String s = "";
        for (int i : set) {
            s += i + " ";
        }
        return s;

    }

}

public class Lop_inset_2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}
