package us.va.yauheni;

public class ParentAbstract {

        protected int a;

        ParentAbstract(){
            this.a = 1; // default
        }

        ParentAbstract(int s){
            this.a = s;   // change
        }

        public int getA() {
            return a;
        }
    }

    class Child extends ParentAbstract {

        Child() {
            int b = a;
            a = b + 3;
        }

        Child(int a) {
            super(a);
        }

        public static void main(String[] args) {

            System.out.println(new Child().a);
            System.out.println(new Child(4).a);

        }
    }

