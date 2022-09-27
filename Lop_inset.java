package java_oop;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author anhla
 */

class IntSet{
    TreeSet<Integer> set = new TreeSet<>();

    public IntSet() {
    }

    public IntSet(int [] a) {
        for(int i = 0 ; i < a.length ; ++i)
            set.add(a[i]);
    }
    
    public int len(){
        return set.size();
    }
    
    public TreeSet<Integer> returnSet(){
        return set;
    }
    
    public IntSet union(IntSet b){
        TreeSet<Integer> s = new TreeSet<>();
        set.addAll(b.returnSet());
        IntSet a = new IntSet();
        a.set = set;
        return a;
    }

    @Override
    public String toString(){
        
        String s = "";
        for(int i : set)
            s += i + " ";
        return s;
        
    }
    
}

public class Lop_inset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
