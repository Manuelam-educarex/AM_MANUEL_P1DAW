package UT05;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número binario :");
		String binario = sc.nextLine();
		String regex = "\\d[01]+";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(binario);
		
		if(matcher.find() ) {
			System.out.println("DNI válido : " + matcher.group());
			
			
		}else {
			System.out.println("DNI no válido");
		}
		
		
		
		
	}

}
