package UT05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*Crea un pequeño traductor.

Carga inicialmente en un HashMap 5 palabras (ej: "Perro" -> "Dog", "Gato" -> "Cat").
Pide una palabra en español al usuario.
Si existe, muestra su traducción.
 Si no existe, pregúntale al usuario cómo se dice en inglés,
  añádela al mapa y dale las gracias por enseñarte.*/	
		
		
		Map<String,String> diccionario = new HashMap<>();
		
		diccionario.put("Perro", "Dog");
		diccionario.put("Gato", "Cat");
		diccionario.put("Caballo", "Horse");
		diccionario.put("Pájaro", "Bird");
		diccionario.put("Oso", "Bear");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabra =sc.nextLine();
		
		if(diccionario.containsKey(palabra)){
			System.out.println(diccionario.get(palabra));
			
		}else {
			
			System.out.println("Traducela");
			String palabra2 = sc.nextLine();
			diccionario.put(palabra, palabra2);
			System.out.println(palabra + "-->" + palabra2);
		}
		
		
		
		
		
		
		
		
		
	}
	

}
