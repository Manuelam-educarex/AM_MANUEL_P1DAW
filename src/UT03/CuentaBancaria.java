package UT03;

public class CuentaBancaria {
	
	 private double iban;
	 private double saldo;
	 public CuentaBancaria(double iban, double saldo) {
		super();
		this.iban = iban;
		this.saldo = saldo;
	 }
	 public double getIban() {
		 return iban;
	 }

	 public double getSaldo() {
		 return saldo;
	 }
	 public void setSaldo(double saldo) {
		 this.saldo = saldo;
	 }
	 
	 
	
	
	

}
