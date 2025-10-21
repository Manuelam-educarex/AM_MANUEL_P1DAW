package Matematicas;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		Calculadora calc = new Calculadora();
		
		
		System.out.println(calc.sumar( a, b));
		System.out.println(calc.restar( a, b));
		System.out.println(calc.multiplicar( a, b));
		System.out.println(calc.dividir( a, b));
		
	}

}
