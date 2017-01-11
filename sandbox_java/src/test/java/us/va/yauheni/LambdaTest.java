package us.va.yauheni;

import java.util.*;

public class LambdaTest {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        for (int i=0; i<10; i++)list.add(GenerateString.generateString(GenerateString.randomint(3,9)));
        for (String s: list) System.out.println(s);
        /*Collections.sort(list, new Comparator<String>(){
             @Override
            public int compare(String o1, String o2) {
                return list.sort();
            }
        });*/
        Comparator<? super String> byLong = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        for (String s: list) System.out.println(s);

    }
}
