package us.va.yauheni;

public class MyFirstProgram {

	public static void main(String[] args){

		double l = 6;
		Square s = new Square(l);
		double a = 8.0;
		double b = 5.0;
		Rectangle r = new Rectangle(a,b);
		hello("user");
		hello("world");
		hello("Yauheni");
		System.out.println("площадь квадрата со строной " + s.l + " = " + area(s));
		System.out.println("площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
}

	public static void hello(String sombody){
		System.out.println("Hello, " +  sombody + "!");
	}

	public static double area(Square s){
		return s.l * s.l;
	}

	public static double area(Rectangle r){
		return r.a * r.b;
	}

}