package us.va.yauheni.cast;

public class Cast {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = new B(); //в данном случае мы создаем объект класса А но используя конструктор класса В.
        // в обратную сторону это не работает??
//        B ba = new A();

        A aab = (A) b; // можно, потому что В наследуется от А
        B bab = (B) ab; // приведение возможно потому что A ab = new B(); в родителе могут лежать наследники роширили котракт
        B ba = (B) a; // compile error нельзя привести наследника к предку
    }
}

class A {
}

class B extends A {
}