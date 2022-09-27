package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class Lop_pair {

    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static class Pair<T, U> {

        T o1;
        U o2;

        Pair(T o1, U o2) {
            this.o1 = o1;
            this.o2 = o2;
        }

        public boolean isPrime() {
            return prime(Integer.parseInt(String.valueOf(o1))) 
                    && prime(Integer.parseInt(String.valueOf(o1)));
        }

        @Override
        public String toString() {
            return this.o1 + " " + this.o2;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(-1);
            }
        }
    }

}
