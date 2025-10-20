package UT02;

public class Rectangulo {
	
	double base, altura;

	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		return base*altura;
	}
	
	public double perimetro() {
		return (base*altura)*2;
		
	}


	
}
