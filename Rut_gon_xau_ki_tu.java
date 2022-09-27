package java_oop;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author anhla
 */
public class Rut_gon_xau_ki_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; ++i)
        {
            if(st.empty())
                st.push(s.charAt(i));
            else
            {
                if(st.peek() == s.charAt(i))
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
        }
        if(st.isEmpty())
            System.out.println("Empty String");
        else 
        {
            String res = "";
            while(!st.empty())
            {
                res = st.peek() + res;
                st.pop();
            }
            System.out.println(res);
        }
    }
}
