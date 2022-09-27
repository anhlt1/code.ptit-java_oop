/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_oop;

import java.util.Scanner;

/**
 *
 * @author anhla
 */
public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int o = 0;
        while(t-- > 0){
            o++;
            int n = sc.nextInt();
            PrimeFactor(n, o);
        }
    }
    public static void PrimeFactor(int n, int t){
        System.out.print("Test " + t + ": ");
        int cnt = 0;
        if(n%2 == 0)
            System.out.print("2(");
        while(n % 2 == 0)
        {
            cnt++;
            n /= 2;
        }
        if(cnt > 0)
            System.out.print(cnt + ") ");
        for(int i = 3 ; i <= Math.sqrt(n) ; i += 2)
        {
            cnt = 0;
            if(n % i == 0)
            {
                System.out.print(i + "(");
                while(n % i == 0)
                {
                    cnt++;
                    n /= i;
                }
                System.out.print(cnt + ") ");
            }
        }
        if(n > 2)
            System.out.print(n + "(1)");
        System.out.print("\n");
    }
}
