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
public class KiemTraFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if(n == 0 || n == 1)
                System.out.println("YES");
            else {
                long fn = 1, f1 = 1, f0 = 0;
                while(fn < n){
                    fn = f0 + f1;
                    f0 = f1;
                    f1 = fn;
                }
                if(fn == n) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
