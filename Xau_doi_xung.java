package java_oop;

import java.util.*;
/**
 *
 * @author anhla
 */
public class Xau_doi_xung {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        scan.nextLine();
        while(t-->0){
            String s= scan.next();
            int cnt=0;
            for(int i=0 ; i<s.length()/2 ; i++)
                if(s.charAt(i)!=s.charAt(s.length()-i-1))
                    cnt++;
            if(cnt==1||s.length()%2==1&&cnt==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
