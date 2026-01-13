package Actividades;

public class Equipo {
	
	private String nombreEquipo;
	private String pais;
	private Jugador jugador;
	
	public Equipo(String nombreEquipo, String pais, String posicion, int dorsal) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.pais = pais;
		this.jugador = new Jugador( posicion, dorsal);
	}
	
	public void mostrarInfo() {
		
		System.out.println("El nombre del equipo es: "+ nombreEquipo);
		System.out.println("El país  del equipo es: "+ pais);
		System.out.println("La posición del jugador es : "+ jugador.getPosicion());
		System.out.println("El dorsal del jugador es : "+ jugador.getDorsal());;		
		
	}
	

}
