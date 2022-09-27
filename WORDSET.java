package java_oop;

import java.util.*;

public class WORDSET {

    public static class WordSet {

        TreeSet<String> s = new TreeSet<>();

        public WordSet() {
        }

        public WordSet(String str) {
            String[] a = str.split(" ");
            for(String i : a)
                s.add(i.toLowerCase());
        }

        public TreeSet<String> returnSet() {
            return s;
        }

        public WordSet union(WordSet a) {
            TreeSet<String> set = new TreeSet<>();
            set.addAll(a.returnSet());
            set.addAll(s);
            WordSet b = new WordSet();
            b.s = set;
            return b;
        }
        
        public WordSet intersection(WordSet a) {
            TreeSet<String> set = new TreeSet<>();
            for(String i : s){
                if(a.s.contains(i))
                    set.add(i);
            }
            WordSet b = new WordSet();
            b.s = set;
            return b;
        }

        @Override
        public String toString() {
            String str = "";
            for(String i : s)
                str += i + " ";
            return str;
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }

}
