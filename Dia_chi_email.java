
package java_oop;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author anhla
 */
public class Dia_chi_email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Vector<String> arr = new Vector<>();
        while(t --> 0){
            String s;
            s = sc.nextLine();
            s = s.trim();
            while(s.contains("  "))
                s = s.replace("  ", " ");
            s = s.toLowerCase();
            String[] a = s.split(" ");
            s = a[a.length - 1];
            for(int i = 0 ; i < a.length - 1 ; ++i)
                s += a[i].charAt(0);
            arr.add(s);
            if(arr.contains(s) == true)
            {
                if(Collections.frequency(arr, s) > 1)
                    s += Collections.frequency(arr, s);
            }
            s += "@ptit.edu.vn";
            System.out.println(s);
        }
    }
    
}
