package us.va.yauheni;

import us.va.yauheni.utils.GenerateString;

import java.nio.channels.FileChannel;

public class runing123{

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(GenerateString.randomint(5,5));
        }
    }
}

class grandChild extends Child123{
    float age;
    grandChild(){
        this.a = 12;
    }
}
class Child123 extends Parent123{
    String str;
    Child123(){
        this.str = "hi";
        this.a = 25;
    }

}

class Parent123 {

    int a;
    Parent123(){
        this.a = 1;
    }
}