package UT03;

public class MainBanco {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta1 = new CuentaBancaria(374.0, 200.0);
		
		System.out.println("El saldo es : "+cuenta1.getSaldo() );
		cuenta1.setSaldo(2000);
		
		System.out.println("El saldo es : "+cuenta1.getSaldo() );
		
		
		
	}

}
