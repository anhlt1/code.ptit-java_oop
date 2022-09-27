package java_oop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Java_OOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for(int t = 1 ; t <= h ; ++t){
            int n = sc.nextInt();
            HashMap<Integer, Integer> m = new HashMap<>();
            int x;
            int[] a = new int[n];
            for(int i = 0 ; i < n ; ++i)
            {
                x = sc.nextInt();
                a[i] = x;
                if(m.containsKey(x))
                {
                    int k = m.get(x);
                    k++;
                    m.put(x, k);
                }
                else
                    m.put(x, 1);
            }
            System.out.println("Test " + t + ":");
//            for (HashMap.Entry<Integer, Integer> e : m.entrySet())
//            {
//                System.out.println(e.getKey() + " xuat hien " + e.getValue() + " lan");
//            }
//            Iterator<Entry<Integer, Integer>> it = m.entrySet().iterator();
            for(int i : a)
            {
                if(m.containsKey(i))
                {
                    int k = m.get(i);
                    System.out.println(i + " xuat hien " + k + " lan");
                    m.remove(i);
                }
            }
        }
    }
}
