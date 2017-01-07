package us.va.yauheni;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Equtatipn {
    static String one = "fire";
    static String two = one;
    public static void main(String[] args){
        System.out.println(one == two);
        System.out.println(one.equals(two));
        one = "fire1";
        System.out.println(one == two);
        System.out.println(one.equals(two));


    }
}
