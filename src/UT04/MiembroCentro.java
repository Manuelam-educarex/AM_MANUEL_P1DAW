package UT04;

public class MiembroCentro {
	
	private String nombre;
	private int id;
	public MiembroCentro(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}
	
	public void mostrarInfo() {
		
		System.out.println("Nombre" + nombre);
		
	}

}
