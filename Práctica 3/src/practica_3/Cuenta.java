package practica_3;
import java.util.Scanner;

public class Cuenta {
	private String nombre;
	private String numCuenta;
	private double tipoInt;
	private double saldo;
	
	static Scanner lector = new Scanner(System.in);
	
	//Constructores
	public Cuenta() {
		
	}
	public Cuenta(String nombre, String numCuenta, double tipoInt, double saldo) {
		this.setNombre(nombre);
		this.setNumCuenta(numCuenta);
		this.setTipoInt(tipoInt);
		this.setSaldo(saldo);
	}
	public Cuenta(Cuenta c1) {
		this.setNombre(c1.nombre);
		this.setNumCuenta(c1.numCuenta);
		this.setTipoInt(c1.tipoInt);
		this.setSaldo(c1.saldo);
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre.toUpperCase();
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getTipoInt() {
		return tipoInt;
	}
	public void setTipoInt(double tipoInt) {
		this.tipoInt = tipoInt;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Métodos de la clase
	public void crearCuenta() {
		System.out.println("Introduzca el nombre: ");
		this.nombre = lector.nextLine();
		System.out.println("Introduzca el número de la cuenta: ");
		this.numCuenta= lector.nextLine();
		System.out.println("Introduzca el tipo de interés: ");
		this.tipoInt=Double.parseDouble(lector.nextLine());
		System.out.println("Introduzca el saldo");
		this.saldo = Double.parseDouble(lector.nextLine());
	}
	public boolean ingresarDinero() {
		System.out.println("Introduzca la cantidad que desea ingresar: ");
		int ingreso = Integer.parseInt(lector.nextLine());
		if (ingreso > 0) {
			this.saldo += ingreso;
			System.out.println("El saldo actual es de "+this.saldo);
			return true;
		}
		else return false;
	}
	public boolean retirarDinero() {
		System.out.println("Introduzca la cantidad que desea retirar: ");
		int retiro = Integer.parseInt(lector.nextLine());
			if (retiro > this.saldo) {
				return false;
			}
			else {
				this.saldo -= retiro;
				System.out.println("El saldo actual es de "+this.saldo);
				return true;
			}
	}
	public void transferirDinero() {
		
	}
	
	 
	

	
}
