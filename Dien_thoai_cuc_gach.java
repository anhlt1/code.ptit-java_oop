package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class Dien_thoai_cuc_gach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t --> 0){
            String s = sc.next();
            if(check(s.toLowerCase()))
                System.out.println("YES");
            else
                System.out.println("NO");
//            System.out.println();
        }
    }
    private static boolean check(String s){
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'b' || c == 'c')
                res += '2';
            if(c == 'd' || c == 'e' || c == 'f')
                res += '3';
            if(c == 'g' || c == 'h' || c == 'i')
                res += '4';
            if(c == 'j' || c == 'k' || c == 'l')
                res += '5';
            if(c == 'm' || c == 'n' || c == 'o')
                res += '6';
            if(c == 'p' || c == 'q' || c == 'r' || c == 's')
                res += '7';
            if(c == 't' || c == 'u' || c == 'v')
                res += '8';
            if(c == 'w' || c == 'x' || c == 'y' || c == 'z')
                res += '9';
        }
        for(int i = 0 ; i < res.length() ; ++i)
            if(res.charAt(i) != res.charAt(res.length() - i - 1))
                return false;
        return true;
    }
}
