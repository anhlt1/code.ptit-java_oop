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
        long[] fibo = new long[93];
        fibo[1] = fibo[2] = 1;
        for(int i = 3 ; i <= 92 ; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.print(fibo[n] + "\n");
        }
    }
}
