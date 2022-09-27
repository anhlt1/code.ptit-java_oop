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
public class TichMaTranVoiChuyenViCuaNo {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int buoc = 1;
        while (t-- > 0) {
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] a;
            a = new int[n][m];
            int[][] c;
            c = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        c[i][j] += a[i][k] * a[j][k];
                    }
                }
            }
            System.out.println("Test " + (buoc++) + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
