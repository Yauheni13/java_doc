package us.va.yauheni;

public class MyFirstProgram {

	public static void main(String[] args){

		hello("user");
		hello("world");
		hello("Yauheni");
		double a = 8;
		double b = 4;
		System.out.println("площадь квадрата со строной " + a + "="+area(a));
		System.out.println("площадь прямоугольника со стронами " + a + " и " + b + " = "+area(a, b));
}
	public static void hello(String sombody){
		System.out.println("Hello, " +  sombody + "!");
	}
	public static double area(double l){
		return l * l;
	}
	public static double area(double a, double b){
		return a * b;
	}
}