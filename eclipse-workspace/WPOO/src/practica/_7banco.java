package practica;
/*
 * hacer un programa sencillo para realizar gestiones en un banco
 * para lo cual tendremos 2 clases(cliente y cuenta)
 * considerar que un cliente se caracteriza por 
 * nombre 
 * dni
 * el cliente puede consultar saldo asic omo ingresar  y retirar dinero 
 * de sus cuentas ademas cada cuenta se caracteriza por por numero de cuenta 
 * y sadoo
 */
public class _7banco {
	private int numerocuenta;
	private double saldo;
	
	public _7banco(int numerocuenta, float saldo) {
		this.numerocuenta = numerocuenta;
		this.saldo = saldo;
	}
	
	public int getnumerocuenta() {
		return numerocuenta;
	}
	
	public double getsaldo() {
		return saldo;
	}
	
	public void ingresardinero(float cantidad) {
		saldo += cantidad;
	}
	
	public void retirardinero(float cantidad) {
		saldo -= cantidad;
	}
	
	
}
