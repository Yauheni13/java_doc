package us.va.yauheni.oop;

public class ConstructorTest {
    public static void main(String[] args) {
//        C c = new C("hi");

        A ab = new B();
        A ac = new C();
        C c = new C();
        C2 c2 = new C2();
//        ab = (C) ab;
//        ac = (B) ac;

    }

}

class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        System.out.println("B");
    }
    B(String b) {
        System.out.println("B"+b);
    }
    B(Integer d) {
        super();
    }
}

class C2 extends B{

}

class C extends B {
    C() {
//        super(123);
        System.out.println("C");
    }
    C(String f) {
        super(123);
//        System.out.println("C"+f);
    }
}
