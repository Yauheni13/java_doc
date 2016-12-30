package us.va.yauheni.oop;

public class Constructor2 {
    public static void main(String[] args) {
        CC cc1 = new CC(23, 12, "World");
        System.out.println("object cc1 i="+cc1.geti()+" ii  = "+cc1.getii()+" str = "+cc1.getStr());
        CC cc2 = new CC();
        System.out.println("object cc2 i="+cc2.geti()+" ii  = "+cc2.getii()+" str = "+cc2.getStr());

        Byte b = 'A';
        char a = 2;
        Integer i = 23;
        String s = i.toString();
    }
}

class AA{
    private int i;
    AA(){
        this.i=1;
    }
    AA(int i){
        this.i = i*i;
    }
    int geti(){return i;}
}
class BB extends AA{
    private float i;
    BB(){
        this.i=1;
    }
    BB(int i, float ii){
        super(i);
        this.i = 22*ii;
    }
    float getii(){return i;}
}
class CC extends BB{
    private String str;

    CC(){
        this.str="Hi";
    }
    CC(int i, float ii, String str){
        super(i, ii);
        this.str = str+"HI";
    }
    String getStr(){return str;}
}