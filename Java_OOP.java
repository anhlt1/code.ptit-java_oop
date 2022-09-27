package java_oop;

import java.util.*;

public class Java_OOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        for(int i = 0 ; i < a.length ; ++i)
            System.out.print(Float.parseFloat(a[i])+" ");
    }
}
