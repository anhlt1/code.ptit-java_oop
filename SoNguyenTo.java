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
public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(Prime(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean Prime(int n){
        if(n < 2) return false;
        else if(n == 2 || n == 3) return true;
        else if(n%2 == 0 || n%3 == 0) return false;
        else 
            for(int i = 5 ; i <= Math.sqrt(n) ; i += 6)
                if(n % i == 0 || n % (i + 2) == 0) return false;
                return true;
    }
}
