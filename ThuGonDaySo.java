
package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */
public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < n ; ++i)
        {
            int x = sc.nextInt();
            if(st.empty() || (st.peek() + x) % 2 != 0)
//                peek(): top cua stack
                st.push(x);
            else 
                st.pop();
        }
        System.out.println(st.size());
    }
}
