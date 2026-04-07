package UT06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AnalisisNominas {

	public static void main(String[] args) throws IOException {
		
		File directorio = new File(".");
		
		System.out.println("El directorio actual es: "+ directorio.getAbsolutePath());
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("./src/UT06/empleados.csv"));
			String linea;
			
			linea = br.readLine();
			double totalSalarios = 0;
			Double salarioMasAlto = 0.0;
			String empleadoMejorPagado = "";
			while((linea = br.readLine()) != null) {
				//System.out.println(linea);
				String campos[] = linea.split(",");
				
				totalSalarios += Double.parseDouble(campos[3]);
				
				if(salarioMasAlto < Double.parseDouble(campos[3])) {
					salarioMasAlto = Double.parseDouble(campos[3]);
					empleadoMejorPagado = campos[1];
				}

	
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter("./src/UT06/informe_rrhh.txt"));
					PrintWriter out = new PrintWriter(bw)){
				out.println("El gasto total en salario es : " + totalSalarios);
				out.println("El empleado mejor pagado es: "+ empleadoMejorPagado + "con: " + salarioMasAlto);
			}catch(IOException e) {
				System.out.println("Error: "+ e.getMessage());
			}
					
			
			
			
				System.out.println("El total en salario es: " + totalSalarios);
				System.out.println("El empleado con mayor salario es:" +empleadoMejorPagado + " con " + salarioMasAlto);
				
		}catch(FileNotFoundException e) {
			e.printStackTrace();
					
				}
		
		
		
			
	}

}
