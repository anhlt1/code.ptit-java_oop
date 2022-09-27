package java_oop;

import java.util.*;

/**
 *
 * @author anhla
 */

class Person{
    
    String name, dob;
    int d, m, y;

    public Person() {
    }

    public Person(String name, String dob, int d, int m, int y) {
        this.name = name;
        this.dob = dob;
        this.d = d;
        this.m = m;
        this.y = y;
    }
    
    
}

public class Tre_nhat_gia_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s;
        Person[] a = new Person[n];
        for(int i = 0 ; i < n ; ++i)
            a[i] = new Person();
        for(int i = 0 ; i < n ; ++i)
        {
            s = sc.nextLine();
            String[] tmp = s.split(" ");
            a[i].name = tmp[0];
            a[i].dob = tmp[1];
            String[] tem = a[i].dob.split("/");
            a[i].d = Integer.parseInt(tem[0]);
            a[i].m = Integer.parseInt(tem[1]);
            a[i].y = Integer.parseInt(tem[2]);
            
        }
        List<Person> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(a));
        Collections.sort(arr, (Person x, Person y) -> {
            if(x.y != y.y)
                return Integer.compare(x.y, y.y);
            if(x.m != y.m)
                return Integer.compare(x.m, y.m);
            if(x.d != y.d)
                return Integer.compare(x.d, y.d);
            return 1;
        });
        System.out.println(arr.get(n-1).name+"\n"+arr.get(0).name);
    }
}