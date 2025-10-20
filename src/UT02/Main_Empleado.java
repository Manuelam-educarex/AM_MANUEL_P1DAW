package UT02;
import java.util.Scanner;
public class Main_Empleado {

	public static void main(String[] args) {
		
		
		double salario;
		Empleado operario = new Empleado("Sin nombre", 0);
		Scanner teclado = new Scanner(System.in);
			
		
		
		System.out.println("Introduce el nombre del empleado: ");
	
		
		operario.setNombre(teclado.nextLine());
		
		System.out.println("Introduce el salario del empleado: ");
		salario = teclado.nextDouble();
		
		operario.setSalario(salario);
		
		
		operario.mostrarInfo();
		
		System.out.println("¿En cuanto quieres aumentar el salario del empleado?: ");
		double aumento = teclado.nextDouble();
		teclado.nextLine();
		
		
		operario.aumentarSalario(aumento);
		
		operario.mostrarInfo();
		
		
		System.out.println("Introduce el nombre del limpiador: ");
		String nombre = teclado.nextLine();
		System.out.println("introduce el salario del limpiador: ");
		double salLimpiador = teclado.nextDouble();
		
		
		Empleado limpiador = new Empleado(nombre, salLimpiador);
		limpiador.mostrarInfo();
		
		teclado.close();
		
		
	}

}
