package EjerciciosFichaRepaso;

import java.util.Scanner;

public class Ejer_21 {

	public static void main(String[] args) {
		/*21. Una empresa de alquiler de vehículos de tres clases: pequeños, medianos y grandes. La
tarifa del alquiler por día es: 15€ en el auto pequeño, 20 € en el auto mediano y 30€ en el
auto grande. Además, la empresa cobra 0.20 €/km recorrido en vehículo pequeño, 0.30
€/km recorrido en vehículo mediano y 0.40€ /km recorrido en vehículo grande. Si la cantidad
de km recorridos por el auto supera los 10 km por día se le aumentara un 2.5% sobre el
monto a pagar por el cliente.
Realice un programa que reciba el tipo de vehículo, los km a recorrer y muestre por pantalla
el coste del alquiler del vehículo.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un vehículo(pequeño ,mediano ,grande)");
		char vehiculo;
		vehiculo = sc.nextLine().toLowerCase().charAt(0);
		System.out.println("Introduce los km que deseas recorrer");
		double km = sc.nextInt();
		
		double coste ;
		
		
		if(km>10) {
			
			  
		}
		
		
		
		switch (vehiculo) {
		
		case 'p':
			System.out.println("El coste del coche es : " + (15+(km*0.20)) + "euros" );
			break;
		
		case 'm':
			System.out.println("El coste del coche es :" + (20+(km*0.30)) + "euros" );
			break;
			
		case 'g':
			System.out.println("El coste del coche es :" + (30+(km*0.40)) + "euros" );
			break;
			default:
				System.err.println("Error");
				
				
			
			
		
		
			
			
		}

	}

}
