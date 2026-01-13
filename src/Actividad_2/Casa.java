package Actividad_2;

public class Casa {
	
	private String direccion;
	private int habitaciones;
	private Habitacion habitacion;
	public Casa(String direccion, int habitaciones, String nombre, double metrosCuadrados) {
		super();
		this.direccion = direccion;
		this.habitaciones = habitaciones;
		this.habitacion =  new Habitacion(nombre , metrosCuadrados);
	}
	

}
