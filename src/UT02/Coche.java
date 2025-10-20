package UT02;

public class Coche {
	
	String marca;
	int anio;
	

	public Coche() {
	marca="Sin marca";
	anio=2000;
	
}
	public Coche(String marca, int anio) {
		this.marca = marca;
		this.anio=anio;
		
		
	}
	
	public void mostrarCoche() {
		System.out.println("La marca de este coche es: " + marca + "matriculado en el año"  +anio);
		
	}
		
		
	
	

}
