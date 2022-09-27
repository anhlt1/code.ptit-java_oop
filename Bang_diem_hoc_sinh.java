package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */

class HS{
    String name, code, level;
    double gpa;

    public HS() {
    }

    public HS(String name, String code, String level, double gpa) {
        this.name = name;
        this.code = code;
        this.level = level;
        this.gpa = gpa;
    }
    
}

public class Bang_diem_hoc_sinh {
    public static String find(double n){
        if(n >= 9)
            return "XUAT SAC";
        if(n >= 8 && n <= 8.9)
            return "GIOI";
        if(n >= 7 && n <= 7.9)
            return "KHA";
        if(n >= 5 && n <= 6.9)
            return "TB";
        return "YEU";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HS[] a = new HS[n];
        for(int i = 0 ; i < n ;++i)
            a[i] = new HS();
        for(int i = 0 ; i < n ; ++i)
        {
            String s = "HS";
            if(i+1 < 10)
                s += "0" + (i+1);
            else
                s += (i+1);
            a[i].code = s;
            for(int j = 1 ; j <= 2 ; ++j)
            {
                if(j == 1)
                {
                    s = sc.nextLine();
                    a[i].name = s;
                }
                else
                {
                    double sum = sc.nextDouble() * 2;
                    sum += sc.nextDouble() * 2;
                    for(int o = 3 ; o <= 10 ; ++o)
                        sum += sc.nextDouble();
                    a[i].gpa = sum / 12;
                    a[i].level = find(a[i].gpa);
                    sc.nextLine();
                }
            }
        }
        List<HS> hsinh = new ArrayList<>();
        hsinh.addAll(Arrays.asList(a));
        Collections.sort(hsinh, (HS x, HS y) -> {
            if(x.gpa != y.gpa)
                return Double.compare(y.gpa, x.gpa);
            return x.code.compareTo(y.code);
        });
        for(HS i : hsinh){
            System.out.print(i.code+" "+i.name+" ");
            System.out.printf("%.1f", Math.round(i.gpa*100.0)/100.0);
            System.out.println(" "+i.level);
        }
    }
}
