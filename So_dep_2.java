
package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class So_dep_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String s;
            s = sc.nextLine();
            if(check(s) && isPalindrome(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    private static boolean check(String s){
        char[] a = s.toCharArray();
        if(a[0] != a[a.length - 1])
            return false;
        int sum = 0;
        for(int i = 0 ; i < a.length ; ++i)
            sum += (a[i] - '0');
        if(sum % 10 != 0)
            return false;
        return true;
        
    }
    private static boolean isPalindrome(String s){
        char[] a = s.toCharArray();
        for(int i = 0 ; i < a.length/2 ; ++i)
            if(a[i] != a[a.length - i - 1])
                return false;
        return true;
    }
}