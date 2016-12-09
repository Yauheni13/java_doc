package us.va.yauheni;

public class MyFirstProgram {

	public static void main(String[] args){

		double l = 9;
		Square s = new Square(l);
		double a = 7.0;
		double b = 5.0;
		Rectangle r = new Rectangle(a,b);
		hello("user");
		hello("world");
		hello("Yauheni");
		System.out.println("площадь квадрата со строной " + s.l + " = " + s.area());
		System.out.println("площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
}

	public static void hello(String sombody){
		System.out.println("Hello, " +  sombody + "!");
	}



}