
package java_oop;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class Tap_tu_rieng_cua_hai_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            HashSet<String> s = new HashSet<>();
            String a = sc.nextLine();
            String b = sc.nextLine();
            a = a.trim();
            String[] arr = a.split(" ");
            for(int i = 0 ; i < arr.length ; ++i)
                if(b.contains(arr[i]) == false)
                    s.add(arr[i]);
            for(String value : s)
                System.out.print(value + " ");
            System.out.println("");
        }
    }
}