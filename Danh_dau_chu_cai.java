package java_oop;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class Danh_dau_chu_cai {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean[] a = new boolean[26];
        Arrays.fill(a, false);
        for(int i = 0 ; i < s.length() ; ++i)
        {
            a[s.charAt(i) - 'a'] = true;
        }
        int cnt = 0;
        for(int i = 0 ; i < 26 ; ++i)
            if(a[i])
                ++cnt;
        System.out.println(cnt);
    }
}
