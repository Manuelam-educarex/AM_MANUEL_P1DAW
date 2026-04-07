package UT05;

import java.util.HashSet;
import java.util.Set;

public class Ejercicio2 {
	
	public static void main(String[] args) {
/*Queremos generar una combinación de la Lotería Primitiva (6 números entre 1 y 49).

Usa un HashSet<Integer>.
Genera números aleatorios y mételos en el set hasta que el tamaño (size()) sea 6.
Reflexión: ¿Por qué usamos un while (set.size() < 6) y no un for de 6 vueltas? 
(Respuesta: porque si sale un repetido, 
el Set no crece, y necesitamos asegurar 6 distintos)*/
		
		
		Set<Integer> num = new HashSet<Integer>();
		
		
		
		while(num.size()<6) {
			int numero = (int) (Math.random()*49 + 1);
			num.add(numero);
			
			
			
		}
		System.out.println(num);
		
		
		
		
	
		
		
		
		
		
	}

}
