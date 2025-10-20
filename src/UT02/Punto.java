package UT02;

public class Punto {
	
	int x,y;
	
	public Punto() {
		x=0;
		y=0;
	}
	public Punto (int a, int b) {
		x=a;
		y=b;
		
		
	}
	public void mostrarPunto() {
		System.out.println("Las coordenadas del punto son: (" +x+", "+y+")");
		
	}
	public static void main(String args[]) {
		Punto a = new Punto();
		Punto b = new Punto(3,4);
		Punto c = new Punto(-1,-5);
		
		a.mostrarPunto();
		b.mostrarPunto();
		c.mostrarPunto();
		
	}

}
