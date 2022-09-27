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
public class UocSoNguyenToLonNhat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            long n=scan.nextLong();
            for(int i=1;i<n;i++){
                if(n%i==0&&Prime(n/i)==1){
                    System.out.println(n/i);
                    break;
                }
            }
        }
    }
    public static long Prime(long n){
        if(n<2)
            return 0;
        else 
            for(int i=2;i<=Math.sqrt(n);i++)
                if(n%i==0)return 0;
        return 1;
    }
}
