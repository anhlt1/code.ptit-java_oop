
package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class TongUocSo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        //sieve
        int MAX = 2000000;
        boolean[] check = new boolean[MAX+1];
        for(int i = 0 ; i <= MAX ; i++) check[i] = true;
        for(int i = 2 ; i <= Math.sqrt(MAX) ; i++)
            if(check[i])
                for(int j = i * i ; j <= MAX ; j += i)
                    check[j] = false;
        
        long res = 0;
        while(t-->0)
        {
            int n = sc.nextInt();
            
            if(n % 2 == 0)
                while(n % 2 == 0)
                {
                    res += 2;
                    n /= 2;
                }
            
            for(int i = 3 ; i <= n ; i += 2)
            {
                if(check[n]){
                    res += n;
                    break;
                }
                
                if(check[i]){
                    while(n % i == 0)
                    {
                        res += i;
                        n /= i;
                    }
                }
            }
            
        }
        System.out.println(res);
    }
}
