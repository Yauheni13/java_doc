package us.va.yauheni;

import java.nio.channels.FileChannel;

/**
 * Created by lenovo on 23.12.2016.
 */
public class runing123{

    public static void main(String[] args){
    Child123 child123 = new Child123();
    Parent123 parent123 = new Parent123();
    System.out.println(child123.str);
    System.out.println(child123.a);
    System.out.println(parent123.a);
    System.out.println("class Grand  " + new grandChild().a);
    System.out.println("class Grand  " + new grandChild().str);
    System.out.println("class Grand  " + new grandChild().age);
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