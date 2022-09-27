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
public class CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            s = solve(s);
            if(s == "INVALID")
                System.out.println(s);
            else
                System.out.println(Long.parseLong(s));
        }
    }
    public static String solve(String s){
        char[] a=s.toCharArray();
        String x="";
        for(int i=0;i<s.length();i++){
            if(a[i]!='0'&&a[i]!='1'&&a[i]!='8'&&a[i]!='9')
                return "INVALID";
            if(a[i]=='0'||a[i]=='8'||a[i]=='9')
                x+="0";
            else x+="1";
        }
        char[] b=x.toCharArray();
        for(int i=0;i<x.length();i++)
            if(b[i]!='0')
                return x;
        return "INVALID";
    }
}
